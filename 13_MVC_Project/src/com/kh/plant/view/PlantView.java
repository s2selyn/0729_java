package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

	// View : 시각적인 부분 담당, 화면 입/출력
	// 사용자와 애플리케이션과의 인터페이스
public class PlantView {
	
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		
		// 저장소 : ArrayList
		
		while(true) {
			
			System.out.println();
			System.out.println("식물 관리 프로그램입니다.");
			
			// 식물 CRUD 하기, 모든 프로그램이 가지는 기본 소양
			// Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가하는 작업
			// Read   : 만들어진 식물을 조회하는 작업(읽어오기)
			// Update : 기존의 식물을 수정하는 작업
			// Delete : 식물을 삭제하는 작업
			
			System.out.println("1. 식물 추가하기");
			System.out.println("2. 식물 전체조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록을 파일로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			
			System.out.print("어떤 기능을 이용하시겠어요 > ");
			// 입력받으려면 스캐너
			
			try {
				
				int menuNo = sc.nextInt();
				sc.nextLine(); // nextInt 했으니 입력버퍼 날리기 해주는게 좋겠다
				
				switch(menuNo) {
				case 1 : createPlant(); break;
				case 2 : readAll(); break;
				case 3 : findByKeyword(); break;
				case 4 : deletePlant(); break;
				case 5 : updatePlant(); break;
				case 6 : pc.outputFile(); break; // PlantDao로 바로 안가고 컨트롤러를 거쳐서 감, DAO로 바로가도 DAO는 할 수가 없음
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
				}
				
			} catch(InputMismatchException e) {
				
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine();
				
			}
			
		}
		
	}
	
	// 1. 새롭게 식물을 추가할 수 있는 화면을 보여주는 메소드
	private void createPlant() {
		
		System.out.println("\n☘ 식물추가서비스입니다.");
		System.out.print("식물 명을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.print("종류를 입력해주세요 > ");
		String type = sc.nextLine();
		
		// 식물 VO클래스에 대입할 값 두 개를 입력받았음
		// View는 일단 할 일이 끝남
		
		// Controller로 전달
		// 사용자가 입력한 식물명이랑 종류를 가지고 식물목록에 추가해줘 => 요청
		// method call
		pc.createPlant(name, type); // 메소드를 호출하는 쪽에서는 값(인자값)을 준다
		
		System.out.println("축하합니다.");
		System.out.println("새로운 식물이 추가되었습니다.");
		
	}
	
	// 2. 전체 식물 목록을 출력해주는 기능
	private void readAll() {
		
		System.out.println();
		System.out.println("전체 식물 목록입니다.");
		
		// Plant타입의 객체들의 주소가 요소로 존재하는 Object[]을 반환
		List<Plant> plants = pc.readAll();
		
		// 경우의 수
		// case 1. 값이 없을 경우(리스트에 요소가 없음)
		// case 2. 값이 하나일 경우
		// case 3. 값이 여러개일경우
		
		// List의 요소가 하나도 존재하지 않을 경우
		if(plants.isEmpty()) {
			
			System.out.println("식물이 존재하지 않습니다.");
			System.out.println("새로운 식물을 추가해보새요.");
			
		} else {
			
			// 최소한 하나라도 있을 경우
			// 요소의 필드값을 뽑아서 출력, 몇개일지 모름 --> 어쩔 수 없이 반복문 사용
			
			for(Plant p : plants) {
				System.out.println("==============================");
				System.out.println("식물이름 : " + p.getName() + ", 식물종 : " + p.getType());
			}
			
		}
		System.out.println();
	}
	
	// 3. 사용자가 식물에 대한 키워드를 입력할 수 있는 화면을 출력해주는 기능
	public void findByKeyword() {
		// 키워드 검색이면 키워드 입력을 받아야 진행되겠지!
		
		System.out.println();
		
		// 포함 시!
		// 1. 사용자가 입력한 키워드가 제목에 포함되어있다면 출력
		// 2. 사용자가 입력한 키워드가 타입에 포함되어있다면 출력
		// 3. 사용자가 입력한 키워드가 제목 또는 타입에 포함되어있다면 출력
		// 4. 사용자가 입력한 키워드가 제목과 타입에 둘 다 포함되어있다면 출력
		
		// 3)
		System.out.println("식물 검색 서비스입니다.");
		System.out.print("검색어를 입력해주세요 > ");
		String keyword = sc.nextLine();
		
		// View가 할 일 끝! 사용자에게 입력받기까지! 이제부터는 컨트롤러가 일해야함
		
		// 실질적인 검색 처리를 해야함, keyword를 들고가서 뒤져보고 찾아야함 --> 이건 여리서 처리를 안하고(입력받고 출력만 할거니까) 컨트롤러로 넘겨서 작업할것임!
		// 원래 이거 컨트롤러에서 하는 거 아님!!! 두개 더 달려야함, 너무 많이 생겨야해서 일단 컨트롤러까지만 만들고 작업함
		// 아무튼 View에서는 하지말자, 근본적으로는 컨트롤러에서도 하는 거 아님! 세칸은 더 가야함
		// 컨트롤러한테 사용자가 입력한 이것을 넘겨줘야함, 요청을 하면서 넘겨주면서, 사용자가 입력한 값까지 전달하려면? 컨트롤러가 가진 메소드를 호출해서 메소드의 매개변수에 인자값을 넘겨주는것!
		List<Plant> searched = pc.findByKeyword(keyword); // 아직 없으니까 빨간줄, 없으면 만들어주면 그만~
		
		// 메소드 만들고 왔다!
		// View는 컨트롤러에서 무슨 일이 일어나는지 모름! 이게 중요함, 알 수 없어야함. 안에 수정되고 이런 일은 컨트롤러가 알아서 할일
// 9:35 몰라야돼, 모르는게 제일 좋아! --> 의존(dependency)관계, 합성(composition), 인터페이스(interface) 예시
		
		// 검색 요청 처리를 해주고 돌아오니까 뭐가 돌아옴? Plant들의 주소값을 담은 배열을 필드로 가지고있는 List의 주소값!
		// 참조자료형은 주소값! 자바는 값만 넘길 수 있음! 자바는 예외가 없음! 넘어갈 수 있는게 오로지 값뿐! 그러면 확인해야 할 것은 주소값이냐 아니냐, 그 이외는 존재하지 않음~ 무조건 주소값
		// 변수에 담음, List<Plant>
		
		// 어제부터 계속 생각해야 할 것 : 검색 결과를 담은 List의 주소가 왔는데, 경우의 수!
		// 검색 결과가 있는 경우와 없는 경우가 있음 --> 있을때는 보여주면 되고, 없을때는 없다고 알려줘야함
		// 우리가 사용자라고 생각했을 때, 없으면 없다고 알려줘야지 슥 지나가면 엥? 뭐야 하게 될 것
		// 경우의 수를 항상 생각해야 함!
		// 있을때와 없을때 출력해줄 내용이 달라짐 --> 조건!
		if(searched.isEmpty()) { // 검색 결과가 없을 경우 --> 조건식을 어떻게 만들까? 무슨 값을 가지고 뭘 비교를 해야 해? null일수는 없음! 컨트롤러에서 객체를 생성했기 때문에 null일 수 없음
			// 근본론으로는 요소가 몇개냐로 비교해야함, 이 연산을 isEmpty() 메소드 호출하면 해줌!
			
			System.out.println("검색 결과가 존재하지 않습니다.");
			
		} else { // 검색 결과가 있을 경우 --> 이 블록에 들어왔다는 것은 결과가 있는데 몇개가 있는지는 알 수 없음, 어쨌든 몇개든지 다 출력해줘야하고, 최소한 하나는 있을것임 --> 방법이 없어서 반복문을 쓰는 것!
			
			System.out.println("조회 결과가 총 " + searched.size() + "건 존재합니다.");
			
			for(Plant p : searched) {
				
				System.out.println("==================================================");
				System.out.println("이름 : " + p.getName() + ", 종류 : " + p.getType());
				
			}
			
		}
		
	}
	
	// 4. 특정 식물을 삭제할 수 있는 화면을 출력해주는 기능
	private void deletePlant() {
		
		System.out.println();
		System.out.println();
		// 고민할 필요가 있음
		// 삭제를 어떻게 할 수 있도록 만들어줄 것인가????
		// 클라이언트 요구사항이 있다면 그대로, 지금은 우리가 생각해야 함
		// 1. 식물이름을 입력받아서 삭제
		// 2. 식물타입을 입력받아서 삭제
		// 3. 식물이름과 타입을 입력받아서 삭제
		// 4. 그냥 아무것도 입력안받고 전체 삭제
		// 아무것도 없는 상황에서 이런것들을 생각해야함
		
		// (3) 이름 및 타입을 입력받아서 삭제
		// 1) 이름만 일치하면 삭제
		// 2) 타입만 일치하면 삭제
		// 3) 이름하고 타입하고 둘다 일치해야 삭제
		// 4) 이름 키워드가 포함되어 있으면 삭제
		// 5) 타입 키워드가 포함되어 있으면 삭제
		// 6) 이름 또는 타입에 키워드가 포함되어 있으면 삭제
		
		// 3-3) 이름하고 타입을 입력받고 둘 다 일치하는 값이 있을 때만 삭제
		System.out.print("식물의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.print("식물의 종류를 입력해주세요 > ");
		String type = sc.nextLine();
		
		// 입력 받으면 뷰는 할일 끝난것
		// 일단 할 일 끝!!
		
		// 실질적으로 이 두개로 있나없나 검사해서 지우고자시고하는건 컨트롤러가 해야함 --> 컨트롤러한테 이거 두개 넘겨주면서 지워줘 해야함!
		// 컨트롤러에게 사용자가 입력한 값 두 개를 전달하면서 삭제요청 보내기
		int count = pc.deletePlant(name, type); // 필드의 주소값을 참조하여 메소드를 호출하면서 순서를 조심해서 전달
		
		// 0
		// 1 ↑
		
		if(count > 0) {
			System.out.println("삭제 성공!");
			System.out.println(name + "을(를) 총 " + count + "개 삭제했습니다!");
		} else {
			System.out.println("삭제할 식물을 찾지 못했습니다.");
		}
		System.out.println();
	}
	
	// View가 하는 일~ 출력
	// 사실 이것도 여기서 하는게 썩 좋은 것은 아님, 성공용 실패용 메소드 따로 하는 방법이 있음
	
	// 5. 특정 식물의 정보를 수정할 수 있는 화면을 출력해주는 기능
	private void updatePlant() {
		
		System.out.println();
		
		// 고민을 해볼만한 부분, 지금 식물들을 식별할 수 있는 식별자가 있는 것이 아님, 무슨 값을 받아서 무슨 값을 바꿀건지 정해야함 --> 경우의 수가 많음
		// 1. 이름 -> 이름
		// 2. 타입 -> 타입
		// 3. 이름, 타입 -> 이름
		// 4. 이름, 타입 -> 타입
		// 5. 이름 -> 타입
		// 6. 타입 -> 이름
		// 7. 이름, 타입 -> 이름, 타입
		// 이건 우리가 생각해야함! 누가 알려주는게 아님. 내가 생각하는 정보수정은 어떻게 구현할것인지 설계는 자기가 하는것
		// 회사가서도 똑같음! 업데이트 만들어라! 하면 안에는 자기가 알아서!
		
		// 7을 택함! 할일은?
		// 사용자에게 식물의 이름 및 타입을 입력받아서
		// 일치하는 식물을 찾아서
		// 새로운 식물의 이름 및 타입으로 갱신
		
		System.out.println("식물 정보 수정 서비스입니다.");
		
		// 이번에는 값을 4개를 입력받아야 함, 검색할때 쓸 이름과 타입, 바꿀 이름과 타입
		// 4개를 입력받기
		System.out.print("기존 식물 이름 > ");
		String name = sc.nextLine();
		
		System.out.print("기존 식물 타입 > ");
		String type = sc.nextLine();
		
		System.out.print("새 식물 이름 > ");
		String newName = sc.nextLine();
		
		System.out.print("새 식물 타입 > ");
		String newType = sc.nextLine();
		
		// 요청 처리를 위한 값을 모두 입력받았음!
		// 1절 끝
		// 실질적으로 사용자 요청에 대한 처리를 해줘야함 --> 이건 컨트롤러한테 해달라고 보내야함(진짜로 컨트롤러가 하는건 아니고 더 가야하지만 지금은 아니고, 어쨌든 View에서는 안할것임)
		// 모델한테 넘겨줘 컨트롤러야~ --> 메소드 호출
		boolean result = pc.updatePlant(name, type, newName, newType); // 식물 갱신해줘 하면서 인자값으로 넘겨야하는 값들을 넘겨줘야함!
		// 주소값이 넘어감, 스트링은 heap의 상수풀, 스트링풀에 올라감, 스트링풀 특 : 같은 리터럴은 올라갈 수 없다 --> 같은 리터럴은 같은 주소를 가리킨다
		// 스트링 특 제일 먼저는 immutable, 불변!(배열 특: 논리적인 구조와 물리적인 구조가 같음을 제일 먼저!)
		
		// 갔다오니 논리타입 값이 옴, 뭐가 올지는 모르지만 일단 변수에 담아줌
		// 성공했을때, 실패했을때 내용을 다르게 보여줄것임 --> 조건!
		if(result) { // 자바를 쓸 때 모든것을 값이라고 봐야한다!
			// result는 이미 값임, 조건식을 적는 것이 아니라 결국 값이 들어가는 곳!
			
			// 연산을 하는 이유 : 무언가 출력해줄 값을 만들고 싶거나, 논리값을 만들고 싶어서
			// 연산도 연산이 목적이 아니라 최종적으로는 값을 만들어내는 것, 값에 집중해야함! 개발자는 값을 다루는 직업
			System.out.println("식물 정보 갱신 성공!");
			
		} else {
			System.out.println("식물이 존재하지 않습니다.");
		}
		
		System.out.println();
		
	}
	
}

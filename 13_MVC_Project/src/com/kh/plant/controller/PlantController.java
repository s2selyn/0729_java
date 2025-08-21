package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

	// Controller : 사용자가 View를 통해 요청했을 때
	// 요청을 받아 처리해준 뒤 다시 처리결과를 View로 반환해줌
public class PlantController {
	
	// 식물저장소
	private List<Plant> plants = new ArrayList();
	// 1, 2, 3절

	private PlantDao pd = new PlantDao();
	
	// 식물을 하나정도 미리 넣어두자.
	// 방법 두가지 정도 1. 생성자블록 안에 add, 2. ?
	// static 블록은 못씀, plants 만들어지기 전에 수행됨
	
	// 초기화블록, 생성자호출되기전에 어쩌고...있었음
	{
		plants.add(new Plant("안시리움", "분재"));
	}
	
	// View에서 식물 추가 요청을 할 때마다 호출되는 메소드
	public void createPlant(String name, String type) {
		
		// 1절 => 객체 생성
		Plant plant = new Plant(name, type);
		
		// 식물저장소에 새로운 식물을 추가
		// 필드로 가지고 있는 List의 필드로 가지고 있는 Object[]의 요소로 추가
		plants.add(plant);
		
	}
	
	public List<Plant> readAll() {
		return plants;
		
	}
	
	// View에서 식물 검색 요청이 왔을 때 호출되는 메소드
	public List<Plant> findByKeyword(String keyword) {
// 9:15 매개변수가 있어야하고, 문자열 자료형을 써야함
		// 검색 결과에 해당하는 식물들(Plant 객체 주소들)을 싸그리몽땅 다 들고가려면? 선택지는 2개정도
		// 1. Plant[] => 배열 몇 칸짜리??
		// 지금은 배열의 길이를 특정지을 수 없음, 몇칸짜리 할 지?
		// 2. List<Plant>
		// 식물들을 담을 수 있는 리스트를 만든다면? 다 들고 갈 수 있겠다! 식물들만 들어갈 수 있게 해주는게 좋겠으니까 제네릭!
		List<Plant> searched = new ArrayList();
		
		// 이거 해서 돌아갈것임!
		// 식물의 이름 또는 타입에 사용자가 입력한 키워드가 포함되어있을 경우
		// 싸그리 몽땅 다 들고가서 출력 해줄 것 --> 이게 조회! 우리가 제일 많이 만드는거! 80% 이상!
		
		// 조회 => 사용자가 입력한 keyword가 포함된 Plant객체의 필드값을 확인
		// 지금 등록된 식물 전부 봐야함
		// plants의 전부 다 하나하나 확인하면서 체크체크
		// plants에 지금 식물이 몇 개 있을지 알수없음, 근데 다 봐야함 --> 방법이 반복문 쓰는 방법밖에 없음! 반복을 쓰고싶어서 쓰는게 아니라 방법이 이거밖에 없어서 쓰는것(사실 방법이 있는데 그거 너무 쉬워서 이거한대요)
		// 1. plants의 요소의 개수만큼 반복
		for(int i = 0; i < plants.size(); i++) {
			// 2. 요소를 변수에 대입(어제 중복코드 쓴거처럼 하기 싫어서)
			Plant plant = plants.get(i); // 이 지역변수 plant에는 뭐가 들어가요? 1. 기본자료형이냐 2. 아니냐 를 생각 --> 기본자료형이 아니므로 참조자료형! 그럼 주소값!
			// 주소는 주소인데 무슨 주소지? 이클립스 쓰면 대충 색깔만봐도 눈치코치가 됨
// 9:25 실제로는 List에 있는 Object...의 주소값을 가져온것
			
			// 2_2. Plant객체의 name필드 또는 type필드에
			//		사용자가 입력한 keyword가 포함되어 있다면~~ --> if
			if(plant.getName().contains(keyword) ||
			   plant.getType().contains(keyword)) {
				// 포함되어 있는지 확인할 때 contains 메소드 호출 --> true / false로 반환해줌
				
				// 이름에 포함되어 있거나 타입에 키워드가 포함되어 있으면, 포함되어 있는 친구(주소)는 싸그리몽땅 searched에 담아서 돌려줄것임
				searched.add(plant);
				
			}
			
		}
		
		return searched; // 빨간줄! --> 메소드의 void 반환형 수정
		
	}
	
	// View에서 식물 삭제 요청이 왔을 때 호출되는 메소드
	public int deletePlant(String name, String type) {
		// 사용자가 입력한 식물이름 + 식물종류와 일치하는 필드값을 가진 Plant객체를 제거
		// case 1. 동일한 이름 및 종류를 가진 식물이 존재하지 않았다.
		// case 2. 동일한 이름 및 종류를 가진 식물이 딱 한개 존재했다.
		// case 3. 동일한 이름 및 종류를 가진 식물이 여러 개 존재했다.(이번에 입력받을 때 중복체크를 하지 않았음)
		// 성공 / 실패 여부에 따라서 View에게 반환값을 다르게 돌려주어야 함
		
		// 식물을 제거한 후 제거된 Plant객체를 담아서 반환
		// Plant p = plants.remove(2);
		// List returnList = new ArrayList();
		// returnList.add(p);
		// return returnList;
		
		// 요소가 삭제 될 때마다 정수값을 증가 시키고
		// 증가된 정수만 반환
		// 몇개 지워졌는지 정수값 돌려보내는게 가장 일반적인 방법
		
		int count = 0; // 돌려줄 int 선언
		
		// 요청처리(배열의 요소 제거, remove 메소드 호출)
		// 삭제할 Plant가 List의 몇번째 요소일지 모름, 모든 요소를 순차적으로 봐야함 --> for문
		for(int i = 0; i < plants.size(); i++) {
			
			plants.get(i); // 이렇게 하면 반복하면서 접근함, 접근하면서 하고싶은 일은? 접근해서 name 속성값과 사용자가 입력한 값, type 속성값과 사용자가 입력한 값이 일치한다면 remove!
			// 전체를 돌면서 조건검사를 해야함! 둘 다 같으면 --> if!
			if(name.equals(plants.get(i).getName()) &&
			   type.equals(plants.get(i).getType())) {
				// 방어적 코드, null일 수 있음(??)
				
				// 일치하는 요소를 제거
				plants.remove(plants.get(i)); // remove할때마다 빠져나가서 i는 증가하는데 배열크기는 줄어들어버림 --> i를 감소시켜서 해결
				
				i--;
				count++; // 지워질때마다 count 증가
				
			}
			
		}
		
		// remove할때 인덱스 넘길수도 있고 주소값 넘길수도 있음
		return count; // count를 return
		
	}
	
	// View에서 식물 수정 요청 시 호출되는 메소드
	public boolean updatePlant(String name, String type, String newName, String newType) {
		
		// 매개변수 네개의 사용 목적이 다름
		// 검색하기 위한 용도(검색용)
		// 검색 결과가 있을 때 바꾸기 위한 용도(갱신용)
		
		// 요청 처리(를 해야함, 식물 수정 해줘!)
		// 기존에 등록이 되어있는 식물의 필드값과 비교해야함, 기존 식물들은 다 heap에 올라가있음, 직접접근할수는 없음, 배열의 주소만 index에 들어있음, 그 배열에 직접접근할수있는건 또 아님, 필드의 필드임
		// plants에 접근할 수 있는 public 메소드를 이용해서 접근하고 확인해야함
		// 근데 몇개가 있는지 모르므로.. --> 반복
		for(int i = 0; i < plants.size(); i++) {
			
			// CRUD 작업에서는 현재 여기까지 배운 내용을 가지고 작성해야 하는 코드가 정해져 있음(수학 공식처럼)
			// 코드는 지금 다 똑같은거 하고있음...
			Plant p = plants.get(i);
			
			if(name.equals(p.getName()) && type.equals(p.getType())) {
				
				// if 블록에 들어온 것의 의미
				// 일치하는 식물이 존재한다.
				// 사용자가 입력한 새 이름 및 새 타입으로 갱신!!!
				// 어제 배운 set!
				// 방법 1.
				// plants.set(i, new Plant(newName, newType));
				// set?? => 첫번째 인자인 인덱스 위치에 요소를
				// 			두번째 인자로 바꿔주는 메소드
				
				// 방법 2. 이걸 좀 더 선호, 1번은 객체를 또 생성하는것이고, 2번은 필드값을 바꾸는 것이므로
				p.setName(newName);
				p.setType(newType);
				return true;
				
			} // 이렇게 하면 기존 필드값을 새 필드값으로 변경함
			
		} // 요청 처리를 못하고 그냥 돌아갈수도 있음, 바꿨을수도 있고 바꾸지 않았을 수도 있음 --> View에 뭔가를 줘야함! 일반적인 이런 상황이라면 int
		
		// 식물은 지금 중복체크를 안했으니 여러개일수있음(delete랑 똑같은 상황) 안해본거 해보자! 하나바꾸면 돌아감~
		// 식물을 모르고 똑같은걸 입력해서 하나 바꾸고싶은걸로 가정
		return false;
				
	}
	
	// 6. 파일로 저장좀 해줘 하고 요청을 받음, 얘가 파일로 빼는건 아니고 DAO가 파일로 뺄것임!
	// DAO한테 파일로 빼줘! 요청해야함(method call)
	public void outputFile() {
		pd.outputFile(plants);
	}
	
}

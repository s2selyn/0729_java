package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		
		// 자바에서 상속이 실패한 가장 대표적인 예시, 상속이 보여줄 수 있는 문제점을 거론할 때 가장 베스트 예시
		// 상속이 문제를 일으키는 예시
		
		// 타입이 Properties인 객체를 사용해보자
		// Map계열임, Hashtable implements Map
		// 명확한 사용 목적이 있음, 사실 볼일이 잘 없긴함
		// 어쩌구저쩌구
		
		// Properties : Map계열 -> Key + Value세트로 저장함
		// 외부파일에 입/출력을 하기위한 용도
		// => .properties파일로 입/출력
		// (프로그램을 동작시키는 데 있어서) 변경하지 않는 설정정보
		// 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		Properties prop = new Properties();
		
		// Map계열이니까 key-value로 요소를 추가하겠지
		// prop.put("키", new Fish());
		
		// 확장자만 properties이고 텍스트 파일임, 반드시 key-value가 String으로 나가야함!
		// 근데 Map을 상속받아서 구현하고 있어서 put으로 집어넣을 수 있음, String이 아닌 다른 형태의 자료가 들어가서 문제를 일으킬 수 있음!
		// Properties가 Map을 상속받고 있기 때문에 일어난 문제 --> 간단히 해결할수있었음, properties를 상속이 아닌 다른 방법으로 구현했으면 끝나는 일
		// Map을 상속하는게 아니라 Map을 필드로 두고, 안쪽에서 Map에 put하는 메소드를 작성한 다음에 외부에는 얘만 노출시키면 됐음 --> 똑같이 Map에 key-value를 넣는것은 똑같은지, put이 노출되어 있어서 아무거나 들어갈 수 있음
		// 애초에 put에서 받을 수 있는 타입을 String으로 정해뒀으므로, 상속을 받지 않은 것 만으로 이게 가능해짐
		
		// 상속을 했기때문에 put이 노출되어 있음! 이런 문제를 해결하기 위해서 다른 방법을 보완했음
		// Properties에 요소를 추가할때는 put을 쓰지 마라! setProperty 메소드로 요소를 추가해라~ --> 얘는 요소 추가할 때 인자가String으로 들어갈 수 밖에 없게 되어있음
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop); // 출력되면 나오는 것들이 동일한 특성을 가짐
		
		try {
			
			// store(OutputStream os, String comment) : 파일에 출력할때 씀
			// prop.store(new FileOutputStream("test.properties"), "쓰고싶은거");
			
			// 입력
			// load(inputStream is) : 입력 받을 때 씀
			// prop.load(new FileInputStream("test.properties")); // 자원반납 해야하는데 안함
			// 이렇게 하면 읽어와서 자신의 요소로 추가함
			// System.out.println(prop.get("Map")); // 소스코드 내에서 사용이 가능해짐!
			
			// Store할 때 메소드를 storeToXML을 사용할 수 있음, XML도 언어!
			// XML로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), null);
			// 파일의 확장자가 xml이 됨, xml 형식으로 출력함
			
			// XML에서 입력 loadFromXML(InputStream is);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}

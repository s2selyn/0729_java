package com.kh.plant.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import com.kh.plant.model.vo.Plant;

public class PlantDao {
	
	// 6번을 처리하려면 DAO에서 해야함!
	// 식물 목록을 텍스트 파일로 뺄거에요!
	// 추가하기 수정하기 열심히 해서 만든것을 파일로 만들 수 있도록, 전에 했던 일기쓰기랑 똑같은 것!
	
	// 식물들의 데이터를 파일로 뺄건데, 식물들의 정보는 어디에 들어있음? plant 객체의 필드, 모든 식물들에 대한 정보는 plant 담는 리스트, 리스트는 컨트롤러가 가지고 있음!
	// 파일로 뽑는건 DAO가 할것임, 파일로 빼달라는 요청은 누가받나요? 그건 View!
	// 딱히 반환은 안해주고 끝내자.. 그만하자 ㅎ
	
	public void outputFile(List<Plant> plants) {
		
		// output file 하려면 뭐가 있어야함?
		// controller가 얘를 부르면서 뭘 받아야 파일로 뽑을 수 있음? 파일로 뽑을 내용! 우리는 식물의 필드의 값을 쓰기로 했지
		// 근데 지금 얘한테 필드가 없으므로 식물들의 필드들이 담긴 배열을 가지고 있는 리스트가 있어야함!
		// 시작하기 전에 계획이 짜져있어야함!
		
		// 얘입장에서 식물들에 접근할 수 있는 무언가가 필요함, 이건 컨트롤러가 갖고있음!
		// 컨트롤러가 메소드 넘겨줄 때 이걸 넘겨줘야함!
		// 넘겨준 걸 받을 수 있게 해둬야함, 매개변수
		
		// 내 프로그램에서 외부로 출력하려면(나가려면) 필요한 것 --> BufferdWriter(배울 예정)
		try(BufferedWriter wr = new BufferedWriter(new FileWriter("plant.txt"))) {
			
			wr.write("\t\t\t\t식 물 목 록");
			wr.newLine();
			wr.newLine();
			wr.newLine();
			wr.write("\t\t\t식물명\t\t\t\t종류");
			wr.newLine();
			for(int i = 0; i < plants.size(); i++) {
				
				wr.write((i+1) + "번 : \t   " + plants.get(i).getName() + "\t\t\t\t" + plants.get(i).getType());
				wr.newLine();
				
			}
			
		} catch(Exception e) {}
		
	}
	
}

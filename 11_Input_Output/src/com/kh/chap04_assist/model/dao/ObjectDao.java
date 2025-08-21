package com.kh.chap04_assist.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.model.vo.Plant;

public class ObjectDao {
	
	// 출력
	// 객체 단위로 출력을 할 때 보조스트림이 필요!
	
	public void outputFile() {
		
		// 방금 만든 plant를 내보낼것임!
		Plant plant = new Plant("홍콩야자", "관엽");
		// 홍콩야자 관엽이 들어있는 plant객체를 내보내려는 것
		// 보조스트림을 쓰려면 기반스트림이 있어야함!
		
		// 기반스트림 => FileOutputStream
		// 보조스트림 => ObjectOutputStream
		// 출력 => writeObject()
		
		// 자원반납은 try-resourse 쓸게요!
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"))) {
			oos.writeObject(plant);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 읽어올때
	public void inputFile() {
		// ObjectInputStream
		// FileInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))) {
			
			// 읽어올땐 어떻게 하지?
			// readObject
			// ois.readObject();
			// 외부에 있는 객체를 가져왔는데, 나한테 없는 클래스일 수 있음 --> 이것에 대한 핸들링도 해줘야함
			Plant plant = (Plant)ois.readObject();
// 12:49 캐스팅 이후 후다닥하심...
			System.out.println(plant);
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}

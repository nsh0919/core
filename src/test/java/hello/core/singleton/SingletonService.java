package hello.core.singleton;

public class SingletonService {

    //1. static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    //2.public을 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용
    public static SingletonService getInstance() {
        return instance;
    }

    //3.생성자를 private으로 선언하여 외부에서 new 키워드를 통한 생성을 하지 못하게 함
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}

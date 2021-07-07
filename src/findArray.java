import java.util.Scanner;

public class findArray {
    public static void main(String[] args) {
        String [] students = {"Kieu Anh", "Anh Van", "Anh Thao", "Huy Nam", "Ngoc Dai", "Be Than", "Cuong Dola", "Binh", "Trung","Anh Chinh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name students:");
        String inputName = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(inputName)){
                System.out.println("Vị trí của sinh viên "+""+ inputName + "là" + " "+ (i+1));
                isExit = true;
                break;
            }
        }
        if(!isExit){
            System.out.println("Không tìm thấy"+ inputName + " trong danh sách");
        }
    }
}

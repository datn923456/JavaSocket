package Bai10demo;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 8888; 

    public static void main(String[] args) throws IOException {
        Socket s=null;
        Scanner nhap=new Scanner(System.in);
        try {
            
            s = new Socket (serverIP,serverPort);
            System.out.println("\nClient da duoc tao");
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            System.out.println("Nhap ten file:");
            String nameFile=nhap.nextLine();
            os.write(nameFile.getBytes());
            while(true)
            {
                System.out.println("Cac tu co san trong server nhu: apple, banana, gold, red, blue v.v...\nNhap 'HET' 2 lan de thoat");
                String nhapvao = nhap.nextLine();
                os.write(nhapvao.getBytes());
                switch(nhapvao){
                    case "apple":{
                        int n=is.read();
                        if(n==0)
                        {
                            System.out.println("Luu tin nhan thanh cong");
                        }
                        break;
                    }
                    case "banana":{
                        int n=is.read();
                        if(n==0)
                        {
                            System.out.println("Luu tin nhan thanh cong");
                        }
                        break;
                    }
                    case "gold":{
                        int n=is.read();
                        if(n==0)
                        {
                            System.out.println("Luu tin nhan thanh cong");
                        }
                        break;
                    }
                    case "red":{
                        int n=is.read();
                        if(n==0)
                        {
                            System.out.println("Luu tin nhan thanh cong");
                        }
                        break;
                    }
                    case "blue":{
                        int n=is.read();
                        if(n==0)
                        {
                            System.out.println("Luu tin nhan thanh cong");
                        }
                        break;
                    }
                    case "HET":{
                        s.close();
                        System.out.println("\nDa Ngat ket noi file");
                        break;
                    }
                    default:{
                        System.out.println("Khong co gi het !!!");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }finally{
            if(s != null){
                s.close();
            }
        }
    }
    
    
}

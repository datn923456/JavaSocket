package Bai10demo;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processing extends Thread{
    private Socket s;
    public  Processing(Socket s) {
        this.s=s;
        
    }
    @Override
    public void run() {
        try {

            InputStream is= s.getInputStream();
            byte[] m=new byte[100];
            int c=is.read(m);
            String nameFile=new String(m,0,c);
            FileOutputStream fos=new FileOutputStream(nameFile);
            while(true)
            {
                try {
                is=s.getInputStream();
                DataOutputStream dos=new DataOutputStream(fos);
                DataInputStream dis=new DataInputStream(is);
                OutputStream os=s.getOutputStream();
                byte[] nhanswitch=new byte[1000];
                int ch=is.read(nhanswitch);
                String s= new String(nhanswitch,0,ch);
                switch(s){
                    case "apple":{
                        String strDate = "tao";
                        System.out.println(strDate);
                        dos.writeBytes(strDate);

                        //***CODE khoảng cách***
                        //String khoangtrong = " ";
                        //dos.writeBytes(khoangtrong);

                        //***CODE xuống dòng***
                        dos.write(System.getProperty("line.separator").getBytes());
                        os.write(0);
                        
                        break;
                    }
                    case "banana":{
                        String strDate = "chuoi";
                        System.out.println(strDate);
                        dos.writeBytes(strDate);

                        //***CODE khoảng cách***
                        //String khoangtrong = " ";
                        //dos.writeBytes(khoangtrong);

                        //***CODE xuống dòng***
                        dos.write(System.getProperty("line.separator").getBytes());
                        os.write(0);
                        
                        break;
                    }
                    case "gold":{
                        String strDate = "vang";
                        System.out.println(strDate);
                        dos.writeBytes(strDate);

                        //***CODE khoảng cách***
                        //String khoangtrong = " ";
                        //dos.writeBytes(khoangtrong);

                        //***CODE xuống dòng***
                        dos.write(System.getProperty("line.separator").getBytes());
                        os.write(0);
                        
                        break;
                    }
                    case "red":{
                        String strDate = "mau do";
                        System.out.println(strDate);
                        dos.writeBytes(strDate);

                        //***CODE khoảng cách***
                        //String khoangtrong = " ";
                        //dos.writeBytes(khoangtrong);

                        //***CODE xuống dòng***
                        dos.write(System.getProperty("line.separator").getBytes());
                        os.write(0);
                        
                        break;
                    }
                    case "blue":{
                        String strDate = "mau xanh";
                        System.out.println(strDate);
                        dos.writeBytes(strDate);

                        //***CODE khoảng cách***
                        //String khoangtrong = " ";
                        //dos.writeBytes(khoangtrong);

                        //***CODE xuống dòng***
                        dos.write(System.getProperty("line.separator").getBytes());
                        os.write(0);
                        
                        break;
                    }
                    default:{
                        break;
                    }
                }
            } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}

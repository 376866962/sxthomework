package day03;

import java.io.*;

public class HomeWork4 {
    static void copyFile(String pathTo, String pathFrom) {

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File(pathFrom));
            os = new FileOutputStream(new File(pathTo));
            byte[] bytes = new byte[1024];
            int count = 0;
            while ((count = is.read(bytes)) != -1) {
                System.out.println(new String(bytes));
                os.write(bytes, 0, count);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();// 关闭输入流
                    is = null;
                }
                if (os != null) {
                    os.flush();// 刷新缓冲区中的内容
                    os.close();// 关闭输出流
                    os = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        copyFile("J:\\a.txt","J:\\b.txt");
    }

}

package ex_api_naver_captcha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CaptchaMainClass {

    public static void main(String[] args) {

        // 1. 키 발급 (서비스를 사용할 수 있는 사용자인지 점검)
        String key = null;

        // 네이버 개발자 센터 - 애플리케이션 등록하면 제공함
        String ClientId = "Y5kQVlEFcw13Ef5rYIRg";
        String ClientSecret = "nzgjnto5oo";

        String code = "0";  // 키 발급 받고 싶으면 : 0, 이미지 값 검증 요청 : 1
        String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;

        Map <String, String> requestHeaders = new HashMap<String, String>();
        requestHeaders.put("X-Naver-Client-Id", ClientId);
        requestHeaders.put("X-Naver-Client-Secret", ClientSecret);

        // apiURL 접속, 네트워크에서는 try catch 는 기본이다
        try {
            URL url = new URL(apiURL); // url 안에 네이버 openApi 입력
            // URL class =
            HttpURLConnection con = (HttpURLConnection) url.openConnection(); // api 접속
            con.setRequestMethod("GET"); // get 방식 요청 - 네이버 방식

            for (Map.Entry<String, String> entry : requestHeaders.entrySet() ) {
                con.setRequestProperty(entry.getKey(), entry.getValue());   // setRequestProperty = 요청한 정보를 저장하는
            }

            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // con(connection) 을 통해서 네이버가 응답해 주는 정보 읽어 오기. 네이버가 응답해 주는 데이터는 text 식으로
                InputStreamReader isr = new InputStreamReader(con.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                StringBuilder sb = new StringBuilder();
                while (true) {
                    line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                System.out.println(sb);
            }
            con.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

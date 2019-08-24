package BackWork;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import panels.OnlinePanel;

import java.io.*;

public class OnlineData {

    long sleepTime = 2000;
    public OnlineData(OnlinePanel oP) {
        final OnlinePanel onlinePanel = oP;
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Gson gson = new GsonBuilder().create();
                while (true) {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/DataFile"));
                        StringBuilder jsonData = new StringBuilder();
                        String str;
                        while ((str = reader.readLine()) != null)
                            jsonData.append(str);
                        DataConfig d = gson.fromJson(jsonData.toString(), DataConfig.class);
                        System.out.println(d);
                        onlinePanel.setData(d);
                        reader.close();
                        sleepTime = (long) d.getUpdateInterval();
                        Thread.sleep(sleepTime);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }


}

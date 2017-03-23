package android.weathertest.com.weathertest.db;

/**
 * Created by Administrator on 2017/3/23.
 */
public class County {
    private int id;
    private  String CounryName;
    private String WeatherId;
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCounryName() {
        return CounryName;
    }

    public void setCounryName(String counryName) {
        CounryName = counryName;
    }

    public String getWeatherId() {
        return WeatherId;
    }

    public void setWeatherId(String weatherId) {
        WeatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

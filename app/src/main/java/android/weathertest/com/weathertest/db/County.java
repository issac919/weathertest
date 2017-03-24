package android.weathertest.com.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/23.
 */
public class County extends DataSupport {
    private int id;
    private  String CountyName;
    private String WeatherId;
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String counryName) {
        CountyName = counryName;
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

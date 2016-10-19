package cxstone.com.github.umengdemo.application;

import android.app.Application;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by xi.chen01 on 2016/10/19.
 * Project:UmengDemo
 * Company:Lodestone
 * Email:Xi.chen01@lodestonemc.com
 */

public class BaseApplication extends Application {

    {
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setSinaWeibo("1117938385", "546bcf86856b876ddacacda7fa0cbe8a");
        PlatformConfig.setQQZone("1105693451", "NEbfDMHiCvADSIfZ");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);
        Config.REDIRECT_URL = "http://github.com.cxstone";
    }
}

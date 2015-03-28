package seth_k.app.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Seth on 3/23/2015.
 * Custom initialization for Ribbit app (init Parse.com API)
 */
public class RibbitApplication extends Application {
    // Enable Local Datastore.

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "E8soxPtReDRFEFbKThWEtwxyVtvLwJV0C88ucSu5", "9ac6VsHCY8AmCKddUIXSGiGSuq7eswQac90ITn5h");
    }
}

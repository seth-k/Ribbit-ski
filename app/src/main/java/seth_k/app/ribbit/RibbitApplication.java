package seth_k.app.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

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

        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    /**
     * Saves to newly logged in/signed up user to the installation .
     * @param user The ParseUser to bind to the device as currently logged in.
     */
    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}

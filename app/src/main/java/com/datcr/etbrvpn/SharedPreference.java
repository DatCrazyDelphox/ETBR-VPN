package com.datcr.etbrvpn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.datcr.etbrvpn.model.Server;

import static com.datcr.etbrvpn.Utils.getImgURL;
import static com.datcr.etbrvpn.view.MainFragment.binding;

public class SharedPreference {

    private static final String APP_PREFS_NAME = "CakeVPNPreference";

    private SharedPreferences mPreference;
    private SharedPreferences.Editor mPrefEditor;

    private static final String SERVER_COUNTRY = "server_country";
    private static final String SERVER_FLAG = "server_flag";
    private static final String SERVER_OVPN = "server_ovpn";
    private static final String SERVER_OVPN_USER = "server_ovpn_user";
    private static final String SERVER_OVPN_PASSWORD = "server_ovpn_password";

    @SuppressLint("CommitPrefEdits")
    public SharedPreference(Context context) {
        this.mPreference = context.getSharedPreferences(APP_PREFS_NAME, Context.MODE_PRIVATE);
        this.mPrefEditor = mPreference.edit();
    }

    /**
     * Save server details
     *
     * @param server details of ovpn server
     */
    public void saveServer(Server server) {
        mPrefEditor.putString(SERVER_COUNTRY, server.getCountry());
        mPrefEditor.putString(SERVER_FLAG, server.getFlagUrl());
        mPrefEditor.putString(SERVER_OVPN, server.getOvpn());
        mPrefEditor.putString(SERVER_OVPN_USER, binding.vUsern.getText().toString());
        mPrefEditor.putString(SERVER_OVPN_PASSWORD, binding.vPasswd.getText().toString());
        mPrefEditor.commit();
    }

    /**
     * Get server data from shared preference
     *
     * @return server model object
     */
    public Server getServer() {

        return new Server(
                mPreference.getString(SERVER_COUNTRY, "Canada"),
                mPreference.getString(SERVER_FLAG, getImgURL(R.drawable.canada)),
                mPreference.getString(SERVER_OVPN, "Blaze.ovpn")
        );
    }
    public void getUsern() {

        String username = mPreference.getString(SERVER_OVPN_USER, null);
        binding.vUsern.setText(username);

    }
    public void getPasswd() {

        String password = mPreference.getString(SERVER_OVPN_PASSWORD, null);
        binding.vPasswd.setText(password);

    }
    public void saveLogin() {
        mPrefEditor.putString(SERVER_OVPN_USER, binding.vUsern.getText().toString());
        mPrefEditor.putString(SERVER_OVPN_PASSWORD, binding.vPasswd.getText().toString());
    }
}

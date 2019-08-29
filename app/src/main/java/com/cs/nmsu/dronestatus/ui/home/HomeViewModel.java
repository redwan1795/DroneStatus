package com.cs.nmsu.dronestatus.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mTextStatus;
    private MutableLiveData<String> mTextAction;
    private MutableLiveData<String> mTextAltitude;
    private MutableLiveData<String> mTextBattery;


    public HomeViewModel() {
        mTextStatus = new MutableLiveData<>();
        mTextStatus.setValue("Status: ");

        mTextAction = new MutableLiveData<>();
        mTextAction.setValue("Action: ");

        mTextAltitude = new MutableLiveData<>();
        mTextAltitude.setValue("Drone Altitude in Meter: ");

        mTextBattery = new MutableLiveData<>();
        mTextBattery.setValue("Battery: ");


    }

    public LiveData<String> getText() {
        return mTextStatus;
    }
    public LiveData<String> getTextStatus() {
        return mTextAction;
    }
    public LiveData<String> getTextAction() {
        return mTextAltitude;
    }
    public LiveData<String> getTextBattery() {
        return mTextBattery;
    }
}
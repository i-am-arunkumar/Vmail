package com.prideofprogrammers.vmail.Fragments.inbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InboxViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is inbox fragment , data from inbox view model");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
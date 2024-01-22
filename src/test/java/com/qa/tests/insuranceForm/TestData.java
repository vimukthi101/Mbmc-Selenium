package com.qa.tests.insuranceForm;

import com.qa.base.BaseTest;

public class TestData extends BaseTest {
    String Url = "https://www.appsheet.com/Account/Login?returnUrl=https%3A%2F%2Fwww.appsheet.com%2Fstart%2F422a90c2-80c8-41e3-8561-c7692d9762cf&provider=google&fullScope=False&appName=Life%20Insurance%20-%20Proposal%20Form";
    String userName = "";
    String password = "";

    public String getUrl() {
        return Url;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}

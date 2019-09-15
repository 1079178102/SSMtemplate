package com.xph.service;

import com.xph.bean.Account;

import java.util.List;

public interface IAccountService {
    // 查询所有账户
    public List<Account> findAll();

    // 保存账户信息
    public void saveAccount(Account account);
}

package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Date 2019-06-28 10:26
 **/

public interface AccountService {
    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}

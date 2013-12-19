package com.taobao.tddl.repo.mysql.spi;

import java.util.Map;

import com.taobao.tddl.common.utils.extension.Activate;
import com.taobao.tddl.executor.spi.IRepository;
import com.taobao.tddl.executor.spi.IRepositoryFactory;

@Activate(name = "MYSQL_JDBC")
public class RepositoryFactoryMyImp implements IRepositoryFactory {

    @Override
    public IRepository buildRepository(Map<String, String> properties) {
        My_Repository myRepo = new My_Repository();
        myRepo.init();
        return myRepo;
    }

}

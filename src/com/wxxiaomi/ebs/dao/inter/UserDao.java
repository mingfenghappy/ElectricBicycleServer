package com.wxxiaomi.ebs.dao.inter;

import java.util.Date;
import java.util.List;

import com.wxxiaomi.ebs.dao.bean.User;
import com.wxxiaomi.ebs.dao.bean.UserCommonInfo;
import com.wxxiaomi.ebs.dao.bean.format.OptionDetail;

public interface UserDao {

	User getUser(String username,String password);
	
	int insertUser(User user);
	
	List<UserCommonInfo> getUserInfosByEms(List<String> names);
	List<UserCommonInfo> getUserInfosByEms(String[] names);
	
	UserCommonInfo getUserInfoByEm(String emname);
	
	UserCommonInfo getUserInfoById(int userid);
	
	int updateUser(UserCommonInfo userInfo);
	
	int updateUserHead(int userid,String imgPath);

	List<UserCommonInfo> getUserInfosByNames(int userid,String name);
	
	List<UserCommonInfo> updateUserFriends(List<String> emnames,List<Date> times);

	int updateUserCover(int userid, String coverPath);

	List<OptionDetail> getOptionDetail(List<OptionDetail> optionDetail);
	
	boolean checkExist(String username);
}

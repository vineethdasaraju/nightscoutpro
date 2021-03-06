package ufl.mc.nightscout.nightscoutpro.utils;

public class QueryConstants {
		
	public static final String GET_USERID_EMAILID = "select user_id from users where email_id=?";
	public static final String GET_USERID_USERNAME = "select user_id from users where user_name=?";
	public static final String GET_PASSWORD = "select password from users where user_name=?";
	public static final String GET_PROFILE = "select * from users where user_id=?";
	public static final String GET_EMAILID_USERID = "select email_id from users where user_id=?";
	public static final String GET_USERNAME_USERID = "select user_name from users where user_id=?";
	public static final String GET_REGNID_USERID = "select ga_regId from users where user_id=?";
	public static final String GET_NS_USERID = "select user_id from nightscout_users "
			+ "where user_id=?";
	public static final String GET_GA_USERID = "select user_id from guardian_angel_users "
			+ "where user_id=?";
	public static final String GET_NS_USERID_EMAILID = "select user_id from nightscout_users "
			+ "where email_id=?";
	public static final String GET_GA_USERID_EMAILID = "select user_id from guardian_angel_users "
			+ "where email_id=?";
	public static final String GET_UNVERIFIED_USERID = "select patient_id from unverified_patients "
			+ "where patient_id=?";
	public static final String GET_GUARDIANLIST = "SELECT user_name,email_id FROM users WHERE user_id IN " +
			"(SELECT user_id FROM guardian_angel_users WHERE user_id IN " +
			"(SELECT guardian_id FROM guardians_for_patient WHERE patient_id=?))";
	public static final String GET_PATIENTLIST = "SELECT user_name,email_id FROM users WHERE user_id IN " +
			"(SELECT user_id FROM nightscout_users WHERE user_id IN " +
			"(SELECT patient_id FROM patients_to_guardian WHERE guardian_id=?))";
	public static final String GET_PATIENTLIST_UNREGISTERED = "select * from "
			+ "unregistered_guardians where guardian_email=?";
	public static final String GET_GUARDIANLIST_PATIENT = "select guardian_id from "
			+ "guardians_for_patient where patient_id = ?";
	public static final String GET_UNIVERSAL_GUARDIANLIST = "select user_id from user_type "
			+ "where is_universal_guardian = 1";
	public static final String GET_FAMILY_MEMBERS = "select guardian_id from patients_to_guardian "
			+ "where patient_id = ? and access_type = 2";
	
	public static final String COUNT_UNREGISTERED_EMAILID = "select count(*) from "
			+ "unregistered_guardians where guardian_email=?";	
	public static final String COUNT_USERS_EMAILID = "select count(*) from users where email_id=?";
	public static final String COUNT_NS_USERS_EMAILID = "select count(*) from nightscout_users where email_id=?";
	public static final String COUNT_GA_USERS_EMAILID = "select count(*) from guardian_angel_users where email_id=?";
	public static final String COUNT_USERS_USERNAME = "select count(*) from users where user_name=?";
	public static final String ADD_USER = "insert into users"
			+ "(email_id,user_name,password,full_name,phone_no,address) "
			+ "values(?,?,?,?,?,?)";
	public static final String ADD_REGID_USERID = "update users SET ga_regId=? where user_id=?";
	public static final String ADD_NS_USER = "insert into "
			+ "nightscout_users(user_id,email_id) values(?,?)";
	public static final String ADD_GA_USER = "insert into "
			+ "guardian_angel_users(user_id,email_id) values(?,?)";
	public static final String ADD_UNVERIFIED = "insert into unverified_patients"
			+ "(patient_id,registered_date) values(?,?)";
	public static final String GET_USERS_USERID = "select user_id from users "
			+ "where email_id=?";
	public static final String GET_ACCESS = "select access_type from unregistered_guardians "
			+ "where user_id=? and guardian_email=?";
	public static final String GET_ACCESS_PATIENTS2GUARD = "select access_type from patients_to_guardian "
			+ "where guardian_id=? and patient_id=?";
	public static final String ADD_UNREGISTERED = "insert into unregistered_guardians"
			+ "(user_id,guardian_email,access_type) values(?,?,?)";
	public static final String ADD_GUARD_4_PATIENT = "insert into guardians_for_patient"
			+ "(patient_id,guardian_id) values(?,?)";
	public static final String ADD_PATIENT_2_GUARD = "insert into patients_to_guardian"
			+ "(guardian_id,patient_id,access_type) values(?,?,?)";
	public static final String ADD_GLUCOSE = "insert into glucose_history"
			+ "(user_id,glucose_value,date,time) values(?,?,?,?)";
	public static final String ADD_LOCATION = "insert into locations"
			+ "(user_id,last_seen_loc_lon,last_seen_loc_lat,last_seen_date,last_seen_time) values(?,?,?,?,?)";
	public static final String GET_LOCATIONS_SLNO_USERID="select sno from locations where user_id=?";
	public static final String REMOVE_UNREGISTERED = "delete from unregistered_guardians "
			+ "where guardian_email=?";	
	public static final String REMOVE_UNREGISTERED1 = "delete from unregistered_guardians "
			+ "where user_id=? and guardian_email=?";
	public static final String UPDATE_LOCATION = "update locations SET last_seen_loc_lon = ?,"
			+ "last_seen_loc_lat = ?,last_seen_time = ?,last_seen_date = ? where sno = ?";
	public static final String UPDATE_ACCESS = "update patients_to_guardian SET "
			+ "access_type = ? where guardian_id = ? and patient_id = ?";
	
	public static final String GET_GLUCOSE_USERID = "select * from glucose_history where user_id =?";
	
	public static final String GET_LOCATION_USERID = "select * from locations where user_id =?";
	public static final String GET_COUNT_GLUCOSE = "select count(*) from glucose_history "
			+ "where user_id = ?";
	public static final String REMOVE_UNVERIFIED  = "delete from unverified_patients "
			+ "where patient_id=?";
	public static final String UPDATE_UNIVERSAL_GUARDIAN_USER_TYPE = "update user_type SET is_universal_guardian = ? "
			+ "where user_id = ?";
	public static final String ADD_USER_TYPE =  "insert into user_type(user_id,is_patient,is_guardian," 
			+ "is_universal_guardian,is_moderator) values(?,?,?,?,?)";
	public static final String UPDATE_NS_USER_TYPE = "update user_type SET is_patient = ? where user_id = ?";
	public static final String UPDATE_GA_USER_TYPE = "update user_type SET is_guardian = ? where user_id = ?";
	public static final String UPDATE_PASSWORD = "update users SET password = ? where user_id = ?";
	public static final String UPDATE_PROFILE = "update users SET email_id = ?, user_name = ?, "
			+ "full_name = ?, phone_no = ?, address = ? where user_id = ?";
}

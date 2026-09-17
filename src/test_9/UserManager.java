package test_9;
import java.util.HashMap;
import java.util.Map;
public class UserManager {
    private Map<String, String> userMap;

    // 构造方法：初始化账号密码数据
    public UserManager() {
        userMap = new HashMap<>();
        // 初始化账号密码，账号唯一，一一对应
        userMap.put("stu001", "123456");
        userMap.put("stu002", "abc666");
        userMap.put("stu003", "test111");
    }

}

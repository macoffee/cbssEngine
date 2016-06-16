package export;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.wocloud.startup.config.Routing.GoverRegion;

/**
 *
 * @author qi.wang@i-soft.com.cn
 * @date 2016年6月15日 下午5:43:35
 */
public class Go2 {

	private static final Logger log = Logger.getLogger("pay");
	public static void main(String[] args) {
		List<Object[]> list = new LinkedList<Object[]>();
		Long s1 = System.currentTimeMillis();
		Connection accConn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			accConn = GoverRegion.getConnectionForAccount();
			accConn.setAutoCommit(false);
			ps = accConn.prepareStatement("select mobile,mobile_active from wo_user");
			rs = ps.executeQuery();
			while (rs.next()){
				Object[] obj = new Object[2];
				obj[0] = rs.getObject(1);
				obj[1] = rs.getObject(2);
				list.add(obj);
			}
			Long s2 = System.currentTimeMillis();
			System.out.println("LinkedList total:"+(s2-s1)+"ms");
			log.info("LinkedList total:"+(s2-s1)+"ms");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			
		}
	}

}

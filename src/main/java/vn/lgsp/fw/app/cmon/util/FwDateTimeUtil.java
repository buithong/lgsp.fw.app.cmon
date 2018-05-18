package vn.lgsp.fw.app.cmon.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FwDateTimeUtil {

	public static LocalDateTime localDateTimeNow() {
		Instant instant = Instant.now();
		ZoneId zoneId_Asia = ZoneId.of( "Asia/Ho_Chi_Minh");
		ZonedDateTime zdt_Asia = ZonedDateTime.ofInstant(instant , zoneId_Asia);
		return zdt_Asia.toLocalDateTime();
	}
}

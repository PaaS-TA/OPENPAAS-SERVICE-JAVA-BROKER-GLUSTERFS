package org.openpaas.servicebroker.glusterfs.common;

import org.springframework.util.StringUtils;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConstantsAuthToken {

	public static String AUTH_TOKEN = "";
	public static String GLUSTERFS_TIMEZONE = "UTC";

	public static ZonedDateTime ISSUED_AT;
	public static ZonedDateTime EXPIRES_AT;
}

package android.support.v4.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

public class FormatTextUtil {

	public static final String[] stringToStringArray(String sText,
			String separator) {

		Collection<String> arrList = stringToArrayList(sText, separator);
		String str[] = new String[arrList.size()];
		arrList.toArray(str);

		return str;
	}

	public static final Collection<String> stringToArrayList(String sText,
			String separator) {
		StringTokenizer st = new StringTokenizer(sText, separator);
		Collection<String> arrList = new ArrayList<String>();

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			arrList.add(token);
		}

		return arrList;
	}

	public static final String arrayListToString(Iterable<String> arrList,
			String separator) {
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		for (String s : arrList) {
			if (i == 0)
				i++;
			if (i > 1)
				sb.append(separator);
			sb.append(s);
		}

		return sb.toString();
	}
}

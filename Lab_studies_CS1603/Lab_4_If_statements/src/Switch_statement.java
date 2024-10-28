
public class Switch_statement {

	public static void main(String[] args) {

		String month = "September";
		int daysinmonth = 0;

		switch(month)
		{
		case "January": 
			daysinmonth = 31;
			break;
		case "February":
			daysinmonth = 28;
			break;
		case "March":
			daysinmonth = 31;
			break; 
		case "April":
			daysinmonth = 30;
			break;
		case "May":
			daysinmonth = 31; 
			break;
		case "June":
			daysinmonth = 30;
			break;
		case "July":
			daysinmonth = 31;
			break;
		case "August":
			daysinmonth = 31;
			break;
		case "September":
			daysinmonth = 30;
			break;
		case "October":
			daysinmonth = 31;
			break;
		case "November":
			daysinmonth = 30;
			break;
		case "December":
			daysinmonth = 31;
			break;
		default: 
			daysinmonth = -1;
			break;
		}

		System.out.println("Days in month " + month + " = " + daysinmonth);

	}

}

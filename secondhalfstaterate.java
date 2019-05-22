
public class StatesInAmerica {
	int income = readInt("Please enter your annual income");
	public String zeroException ()
	{
		if(income<=0)
		{
			return "You pay no taxes!";
		}
	}
	double rate = 0.0 ;
	String state= readLine(" Please Enter your state of residence");
	
	public boolean marriageStatus() {
	String marriage;
	boolean maritalStatus;

	System.out.println("Are you currently married? If so, please enter 'y'. If not, please enter 'n'");
	while (true) {
	  marriage = in.nextLine().trim().toLowerCase();
	  if (answer.equals("y")) {
	    maritalStatus = true;
	    break;
	  } else if (answer.equals("n")) {
	    maritalStatus = false;
	    break;
	  } else {
	     System.out.println("Sorry, I didn't catch that. Please answer y/n");
	  }
	}
	}
	System.out.println(income + ", " + state);
	
	if(input.equals 'Alabama')
	{
		if(income<=500)
		{
			if(maritalStatus == true)
			{
				
			}
			else if(maritalStatus == false)
			{
			
			
		}
	}
	
	if(input.equals 'Alaska')
	{
		
	}
	
	if(input.equals 'Arizona')
	{
		
	}
	
	if(input.equals 'Arkansas')
	{
		
	}
	
	if(input.equals 'California')
	{
		
	}
	
	if(input.equals 'Colorado')
	{
		
	}
	
	if(input.equals 'Connecticut')
	{
		
	}
	
	if(input.equals 'Delaware')
	{
		
	}
	
	if(input.equals 'Florida')
	{
		
	}
	
	if(input.equals 'Georgia')
	{
		
	}
	
	if(input.equals 'Hawaii')
	{
		
	}

	if(input.equals 'Idaho')
	{
		
	}
	
	if(input.equals 'Illinois')
	{
		
	}
	
	if(input.equals 'Indiana;)
	{
		
	}
	
	if(input.equals 'Iowa';)
	{
				
	}
	
	if(input.equals 'Kansas';)
	{
				
	}
	
	if(input.equals 'Kentucky';)
	{
				
	}
	
	if(input.equals 'Louisiana';)
	{
				
	}
	
	if(input.equals 'Maine';)
	{
				
	}
	
	if(input.equals 'Maryland';)
	{
				
	}
	
	if(input.equals 'Massachusetts';)
	{
				
	}
	
	if(input.equals 'Michigan';)
	{
				
	}
	
	if(input.equals 'Minnesota';)
	{
				
	}
	
	if(input.equals 'Mississippi';)
	{
		
	}
	
	if(input.equals 'Missouri';)
	{
		if(income<=99)
		{
			rate = 0.0;
		}
		else if(income >= 100 && income <= 1000)
		{
			rate = .015;
		}
		else if(income > 1000 && income <= 2000)
		{
			rate = .02;
		}
		else if(income > 2000 && income <= 3000)
		{
			rate = .025;
		}
		else if(income > 3000 && income <= 4000)
		{
			rate = .03;
		}
		else if(income > 4000 && income <= 5000)
		{
			rate = .035;
		}
		else if(income > 5000 && income <= 6000)
		{
			rate = .04;
		}
		else if(income > 6000 && income <= 7000)
		{
			rate = .045;
		}
		else if(income > 7000 && income <= 8000)
		{
			rate = .05;
		}
		else if(income > 8000 && income <= 9000)
		{
			rate = .055;
		}
		else if(income > 9000)
		{
			rate = .06;
		}
	}
	
	if(input.equals 'Montana';)
	{
		if(income <= 2800)
		{
			rate = .01;
		}
		else if(income > 2800 && income <= 5000)
		{
			rate = .02;
		}
		else if(income > 5000 && income <= 7600)
		{
			rate = .03;
		}
		else if(income > 7600 && income <= 10300)
		{
			rate = .04;
		}
		else if(income > 10300 && income <= 13300)
		{
			rate = .05;
		}
		else if(income > 13300 && income <= 17000)
		{
			rate = .06;
		}
		else if(income > 17000)
		{
			rate = .069;
		}
	}
	
	if(input.equals 'Nebraska';)
	{
		if(income <= 3050)
		{
			rate = .0246;
		}
		if(income > 3050 && income <= 18280)
		{
			rate = .0351;
		}
		if(income > 18280 && income <= 29460)
		{
			rate = .0501;
		}
		if(income > 29460)
		{
			rate = .0684;
		}
	}
	
	if(input.equals 'Nevada';)
	{
		rate = 0.0;
	}
	
	if(input.equals 'New Hampshire';)
	{
		rate = .05;
	}
	
	if(input.equals 'New Jersey';)
	{
		
	}
	
	if(input.equals 'New Mexico';)
	{
		if(maritalStatus == false)
		{
			if(income <= 5500)
			{
				rate = .017;
			}
			if(income > 5500 && income <= 11000)
			{
				rate = .032;
			}
			if(income > 11000 && income <= 16000)
			{
				rate = .047;
			}
			if(income > 16000)
			{
				rate = .049;
			}
		}
		else if(maritalStatus == true)
		{
			if(income <= 8000)
			{
				rate = .017;
			}
			if(income > 8000 && income <= 16000)
			{
				rate = .032;
			}
			if(income > 16000 && income <= 24000)
			{
				rate = .047;
			}
			if(income > 24000)
			{
				rate = .049;
			}
		}
	}
	
	if(input.equals 'New York';)
	{
		if(income <= 8500)
		{
			rate = .04;
		}
		if(income > 8500 && income <= 11700)
		{
			rate = .045;
		}
		if(income > 11700 && income <= 13900)
		{
			rate = .0525;
		}
		if(income > 13900 && income <= 21400)
		{
			rate = .059;
		}
		if(income > 21400 && income <= 80650)
		{
			rate =.0633;
		}
		if(income > 80650 && income <= 215400)
		{
			rate =.0657;
		}
		if(income > 215400 && income <= 1077550)
		{
			rate = .0685;
		}
		if(income > 1077550)
		{
			rate = .0882;
		}
		}
	}
	
	if(input.equals 'North Carolina';)
	{
		rate = .0575;		
	}
	
	if(input.equals 'North Dakota';)
	{
		rate = .05;		
	}
	
	if(input.equals 'Ohio';)
	{
		if(income <= 5200)
		{
			rate = .00495;
		}
		if(income > 5200 && income <= 10400)
		{
			rate = .00990;
		}
		if(income > 10400 && income <= 15650)
		{
			rate = .01980;
		}
		if(income > 15650 && income <= 20900)
		{
			rate =.02476;
		}
		if(income > 20900 && income <= 41700)
		{
			rate = .02969;
		}
		if(income > 41700 && income <= 83350)
		{
			rate = .03465;
		}
		if(income > 83350 && income <= 104250)
		{
			rate = .03960;
		}
		if(income > 104250 && income <= 208500)
		{
			rate = .04597;
		}
		if(income > 208500)
		{
			rate = .04997;
		}
	}
	
	if(input.equals 'Oklahoma';)
	{
		
	}
	
	if(input.equals 'Oregon';)
	{
		if(income <= 3350)
		{
			rate = .05;
		}
		if(income > 3350 && income <= 8400)
		{
			rate = .07;
		}
		if(income > 8400 && income <= 125000)
		{
			rate = .09;
		}
		if(income > 125000)
		{
			rate = .099;
		}		
	}
	
	if(input.equals 'Pennsylvania';)
	{
		rate = .0307;		
	}
	
	if(input.equals 'Rhode Island';)
	{
		if(income <= 60550)	
		{
			rate = .0375;
		}
		if(income <= 137650)
		{
			rate = .0475;
		}
		if(income > 137650)
		{
			rate = .0599;
		}
	}
	
	if(input.equals 'South Carolina';)
	{
				
	}
	
	if(input.equals 'South Dakota';)
	{
		rate = 0.0;	
	}
	
	if(input.equals 'Tennessee';)
	{
		rate = .06;		
	}
	
	if(input.equals 'Texas';)
	{
		rate = 0.0;		
	}
	
	if(input.equals 'Utah';)
	{
		rate = 0.0;		
	}
	
	if(input.equals 'Vermont';)
	{
		if(maritalStatus == false)
		{
			if(income <= 37450)
			{
				rate = .0355;
			}
			if(income <= 90750)
			{
				rate = .068;
			}
			if(income <= 189300)
			{
				rate = .078;
			}
			if(income <= 411500)
			{
				rate = .088;
			}
			if(income > 411500)
			{
				rate = .0895;
			}
		}
		else if(maritalStatus == true)
		{
			if(income <= 62600)
			{
				rate = .0355
			}
			if(income <= 151200)
			{
				rate = .068;
			}
			if(income <= 230450)
			{
				rate = .078;
			}
			if(income <= 411500)
			{
				rate = .088;
			}
			if(income > 411500)
			{
				rate = .0895;
			}
		}
	}
	
	if(input.equals 'Virgina';)
	{
		if(income <= 3000)
		{
			rate = .02;
		}
		if(income <= 5000)
		{
			rate = .03;
		}
		if(income <= 17000)
		{
			rate = .05;
		}
		if(income > 17000)
		{
			rate = .0575;
		}
	}
	
	if(input.equals 'Washington';)
	{
		rate = 0.0;		
	}
	
	if(input.equals 'West Virginia';)
	{
		if(income <= 10000)
		{
			rate = .03;
		}
		if(income <= 25000)
		{
			rate = .04;
		}
		if(income <= 40000)
		{
			rate = .045;
		}
		if(income <= 60000)
		{
			rate = .06;
		}
		if(income > 60000)
		{
			rate = .065;
		}
	}
	
	if(input.equals 'Wisonsin';)
	{
		if(maritalStatus == false)
		{
			if(income <= 11900)
			{
				rate = .04;
			}
			if(income <= 22190)
			{
				rate = .0584;
			}
			if(income <= 244270)
			{
				rate = .0627;
			}
			if(income > 244270)
			{
				rate = .0765;
			}
		}
		if(maritalStatus == true)
		{
			if(income <= 14790)
			{
				rate = .04;
			}
			if(income <= 29580)
			{
				rate = .0584;
			}
			if(income <= 325700)
			{
				rate = .0627;
			}
			if(income > 325700)
			{
				rate = .0765;
			}
		}
	}
	
	if(input.equals 'Wyoming';)
	{
		rate = 0.0;		
	}



}

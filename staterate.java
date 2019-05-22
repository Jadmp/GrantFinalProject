
public class staterate {
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
	
	if(state.equals 'Alabama')
	{
		if(maritalStatus)
		{
			if(income<=1000)
			{
				return rate =0.02;
			}
			else if((income>=1001) && (income <=6000))
			{
				return rate =0.04;
			}
			else if(income>6000)
			{
				return rate =0.05;
			}
		}
		else
		{
			if(income<=500)
			{
				return rate =0.02;
			}
			else if(income>=501 && income<=3000)
			{
				return rate = 0.04;
			}
			else if(income >3000)
			{
				return rate =0.0;
			}
		}
	}
	if(state.equals 'Alaska')
	{
		return rate ==0.0;
	}
	
	if(state.equals 'Arizona')
	{
		if(income<=10346)
		{
			return rate = .0259;
		}
		else if(income<=25861)
		{
			return rate = .0288;
		}
		else if(income<51721)
		{
			return rate = .0336;
		}
		else if(income<155159)
		{
			return rate=.0424;
		}
		else if(income>15160)
		{
			return rate =.0454;
		}
	}
	
	if(state.equals 'Arkansas')
	{
		if(income<=4299)
		{
			return rate = 0.0;
		}
		else if(income<8500)
		{
			return rate = 0.025;
		}
		
		else if(income<12699)
		{
			return rate = 0.035;
		}
		else if(income<35100)
		{
			return rate =rate 0.069;
		}
	}
	
	if(state.equals 'California')
	{
		if(marriageStatus)
		{
			if(income<16030)
			{
				return rate = .02;
			}
			else if(income<59978)
			{
				return rate = 0.06;
			}
			else if(income<105224)
			{
				return rate= 0.093;
			}
			else if(income < 64499)
			{
				return rate = 0.113;
			}
			else if(income > 1074996)
			{
				return rate = 0.133;
			}
		}
		else if(marriageStatus = false)
		{
			if(income<8015)
			{
				return rate = .01;
			}
			else if(income<19001)
			{
				return rate = 0.04;
			}
			else if(income<41629)
			{
				return rate = 0.08;
			}
			else if(income<526120)
			{
				return rate = 0.093;
			}
			else if(income<537498)
			{
				return rate = 0.123;
			}
			else if(income >1000000)
			{
				return rate = 0.133;
			}
		}
	
	if(state.equals 'Colorado')
	{
		return rate = 0.0463;
	}
	
	if(state.equals 'Connecticut')
	{
		if(marriageStatus)
		{
			if(income<20000)
			{
				return rate = 0.03;
			}
			else if(income<100000)
			{
				return rate = 0.05;
			}
			else if(income<200000)
			{
				return rate = 0.055;
			}
			else if(income < 500000)
			{
				return rate = 0.069;
			}
			else if(income >1000000)
			{
				return rate = 0.0699;
			}
		}
		else if(marriageStatus = false)
		{
			if(income<10000)
			{
				return rate = 0.03;
			}
			else if(income<50000)
			{
				return rate = 0.055;
			}
			else if(income <100000)
			{
				return rate = 0.06;
			}
			else if(income<250000)
			{
				return rate = .069;
			}
			else if(income > 500000)
			{
				return rate = 0.0699;
			}
		}
	}
	
	if(state.equals 'Delaware')
	{
		if(income<2000)
		{
			return rate = 0.022;
		}
		else if(income<10000)
		{
			return rate = 0.048;
		}
		else if(income<25000)
		{
			return rate = 0.052;
		}
		else if(income>60000)
		{
			return rate = 0.066;
		}
	}
	
	if(state.equals 'Florida')
	{
		return rate = 0.0;
	}
	
	if(state.equals 'Georgia')
	{
		if(marriageStatus)
		{
			if(income<1000)
			{
				return rate = 0.01;
			}
			else if(income<3000)
			{
				return rate = 0.02;
			}
			else if(income<7000)
			{
				return rate = 0.04;
			}
			else if(income>10000)
			{
				return rate = 0.06;
			}
		}
		else if(marriageStatus = false)
		{
			if(income <750)
			{
				return rate = 0.01;
			}
			else if(income<2250)
			{
				return rate 0.02;
			}
			else if(income<5250)
			{
				return rate = 0.04;
			}
			else if(income>7000)
			{
				return rate = 0.06;
			}
		}
	}
	
	if(state.equals 'Hawaii')
	{
		if(marriageStatus)
		{
			if(income<4800)
			{
				return rate =0.014;
			}
			else if(income<9600)
			{
				return rate = 0.032;
			}
			else if(income<28800)
			{
				return rate = 0.068;
			}
			else if(income<48000)
			{
				return rate = 0.072;
			}
			else if(income<72000)
			{
				return rate = 0.079;
			}
			else if(income>9600)
			{
				return rate = 0.0825;
			}
		}
		else if(marriageStatus = false)
		{
			if(income<2400)
			{
				return rate = 0.014;
			}
			else if(income<9600)
			{
				return rate = 0.055;
			}
			else if(income<19200)
			{
				return rate = 0.072;
			}
			else if(income<36000)
			{
				return rate = 0.079;
			}
			else if(income>48000)
			{
				return rate = 0.0825;
			}
		}
	}

	if(state.equals 'Idaho')
	{
		if(marriageStatus)
		{
			if(income<2908)
			{
				return rate = 0.016;
			}
			else if(income<8724)
			{
				return rate = 0.0410;
			}
			else if(income<14540)
			{
				return rate = 0.061;
			}
			else if(income>21810)
			{
				return rate = 0.074;
			}
		}
		else if(marriageStatus = false)
		{
			if(income<1454)
			{
				return rate = 0.016;
			}
			else if(income <4362)
			{
				return rate = 0.041;
			}
			else if(income<7270)
			{
				return rate = 0.061;
			}
			else if (income>10905)
			{
				return rate = 0.074;
			}
		}
	}
	
	if(state.equals 'Illinois')
	{
		return rate=0.0375;
	}
	
	if(state.equals 'Indiana;)
	{
		return rate = 0.033;
	}
	
	if(state.equals 'Iowa')
	{
		if(income<1573)
		{
			return rate = 0.0036;
		}
		else if(income<3146)
		{
			return rate = 0.0072;
		}
		else if(income<14157)
		{
			return rate = 0.045;
		}
		else if(income<31460)
		{
			return rate = 0.0648;
		}
		else if(income<47190)
		{
			return rate = 0.068;
		}
		else if(income>70785)
		{
			return rate = 0.0898;
		}
	}
	
	if(state.equals 'Kansas';)
	{
		if(marriageStatus)
		{
			if(income<30000)
			{
				return rate = 0.029;
			}
			else if(income<60000)
			{
				return rate = 0.049;
			}
			else if(income>60000)
			{
				return rate = 0.052;
			}
		}
		else if(marraigeStatus =false)
		{
			if(income<15000)
			{
				return rate = 0.029;
			}
			else if(income<30000)
			{
				return rate = 0.049;
			}
			else if(income>30000)
			{
				return rate = 0.052;
			}
		}
	}
	
	if(state.equals 'Kentucky';)
	{
		if(income<3000)
		{
			return rate = 0.02;
		}
		else if(income < 4000)
		{
			return rate = 0.03;
		}
		else if(income<5000)
		{
			return rate = 0.04;
		}
		else if(income<8000)
		{
			return rate = 0.05;
		}
		else if(income<75000)
		{
			return rate = 0.058;
		}
		else if(income>75000)
		{
			return rate= 0.06;
		}
	}
	
	if(state.equals 'Louisiana';)
	{
		if(marriageStatus)
		{
			if(income<25000)
			{
				return rate = 0.02;
			}
			if(income<100000)
			{
				return rate = 0.04;
			}
			if(income>100000)
			{
				return rate = 0.06;
			}
		}
		else if(!marriageStatus)
		{
			if(income<12500)
			{
				return rate = 0.02;
			}
			if(income<50000)
			{
				return rate = 0.04;
			}
			if(income>50000)
			{
				return rate = 0.06;
			}
		}
	}
	
	if(state.equals 'Maine';)
	{
		if(marriageStatus)
		{
			if(income<42099)
			{
				return rate =  0.058;
			}
			if(income<74999)
			{
				return rate = 0.0675;
			}
			if(income>74999)
			{
				return rate = 0.0715;
			}
		}
		else if(!marriageStatus)
		{
			if(income<21050)
			{
				return rate = 0.058;
			}
			if(income<50000)
			{
				return rate = 0.0675;
			}
			if(income>=50000)
			{
				return rate = 0.0715;
			}
		}
	}
	
	if(state.equals 'Maryland';)
	{
		if(income<1000)
		{
			return rate=0.02;
		}
		if(income<2000)
		{
			return rate = 0.03;
		}
		if(income<3000)
		{
			return rate = 0.04;
		}
		if(income<100000)
		{
			return rate = 0.0475;
		}
		if(income<150000)
		{
			return rate = 0.0525;
		}
		if(income<250000)
		{
			return rate = 0.0575;
		}
	}
	
	if(state.equals 'Massachusetts';)
	{
		return rate = 0.051;	
	}
	
	if(state.equals 'Michigan';)
	{
		return rate = 0.0425;		
	}
	
	if(state.equals 'Minnesota';)
	{
		if(marriageStatus)
		{
			if(income<37110)
			{
				return rate= 0.0535;
			}
			if(income<147450)
			{
				return rate=0.0705;
			}
			if(income<261510)
			{
				return rate = 0.0785;
			}
			if(income>=261510)
			{
				return rate = 0.0985;
			}
		}
		else if(!marriageStatus)
		{
			if(income<25390)
			{
				return rate = 0.0535;
			}
			if(income<83400)
			{
				return rate = 0.0705;
			}
			if(income<156911)
			{
				return rate = 0.0785;
			}
			if(income>=156911)
			{
				return rate = 0.0985;
			}
		}
	}
	
	if(state.equals 'Mississippi';)
	{
		if(income<5000)
		{
			return rate = 0.03;
		}
		if(income<10000)
		{
			return rate = 0.04;
		}
		if(income>=5000)
		{
			return rate = 0.05;
		}
	}
	
	if(state.equals 'Missouri';)
	{
				
	}
	
	if(input.equals 'Montana';)
	{
				
	}
	
	if(input.equals 'Nebraska';)
	{
				
	}
	
	if(input.equals 'Nevada';)
	{
				
	}
	
	if(input.equals 'New Hampshire';)
	{
				
	}
	
	if(input.equals 'New Jersey';)
	{
				
	}
	
	if(input.equals 'New Mexico';)
	{
				
	}
	
	if(input.equals 'New York';)
	{
				
	}
	
	if(input.equals 'North Carolina';)
	{
				
	}
	
	if(input.equals 'North Dakota';)
	{
				
	}
	
	if(input.equals 'Ohio';)
	{
				
	}
	
	if(input.equals 'Oklahoma';)
	{
				
	}
	
	if(input.equals 'Oregon';)
	{
				
	}
	
	if(input.equals 'Pennsylvania';)
	{
				
	}
	
	if(input.equals 'Rhode Island';)
	{
				
	}
	
	if(input.equals 'South Carolina';)
	{
				
	}
	
	if(input.equals 'South Dakota';)
	{
				
	}
	
	if(input.equals 'Tennessee';)
	{
				
	}
	
	if(input.equals 'Texas';)
	{
				
	}
	
	if(input.equals 'Utah';)
	{
				
	}
	
	if(input.equals 'Vermont';)
	{
				
	}
	
	if(input.equals 'Virgina';)
	{
				
	}
	
	if(input.equals 'Washington';)
	{
				
	}
	
	if(input.equals 'West Virginia';)
	{
				
	}
	
	if(input.equals 'Wisonsin';)
	{
				
	}
	
	if(input.equals 'Wyoming';)
	{
				
	}


}

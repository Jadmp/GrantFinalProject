
public class staterate {
	int income = readInt("Please enter your annual income");
	public String zeroException ()
	{
		if(income<=0)
		{
			return "You pay no taxes!";
		}
	}
	double tax = 0.0;
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
				tax = 1000 * 0.02;
			}
			else if((income>=1001) || (income <=6000))
			{
				 tax = (1000 * .02) + (4999 *0.04);
			}
			else if(income>6000)
			{
				tax = (1000 *.02) +(4999 *.04) + ((income-5999)*(.06);
			}
		}
		else
		{
			if(income<=500)
			{
				tax = 500*.02;
			}
			else if(income>=501 || income<=3000)
			{
				 tax = (500*.02) + (2499* 0.04);
			}
			else if(income >3000)
			{
				 tax = (500*.02) + (2499* 0.04) +(income-3000)*(0.052);
			}
		}
	}
	if(state.equals 'Alaska')
	{
		tax =0;
	}
	
	if(state.equals 'Arizona')
	{
		if(income<=10346)
		{
			 tax = (10346* .0259);
		}
		else if(income<=25861)
		{
			 tax = (10346* .0259) + (15515*.0288);
		}
		else if(income<51721)
		{
			 tax = (10346* .0259) + (15515*.0288)+ (25860*.0336);
		}
		else if(income<151159)
		{
			 tax = (10346* .0259) + (15515*.0288)+ (25860*.0336) + (103438 *.0424);
		}
		else if(income>155600)
		{
			 tax = (10346* .0259) + (15515*.0288)+ (25860*.0336) + (103438 *.0424) + ((income-155600)*.0454);
		}
	}
	
	if(state.equals 'Arkansas')
	{
		if(income<=4299)
		{
			 tax = 0.0;
		}
		else if(income<8500)
		{
			 tax = (4201* 0.025);
		}
		
		else if(income<12699)
		{
			 tax = (4201* 0.025)+(4199 *0.035);
		}
		else if(income<35100)
		{
			 tax = (4201* 0.025)+(4199 *0.035)+ ((income-35100)* 0.069);
		}
	}
	
	if(state.equals 'California')
	{
		if(marriageStatus)
		{
			if(income<16030)
			{
				 tax = (16030*.02);
			}
			else if(income<59978)
			{
				 tax =(43948* 0.06)+(16030*.02);
			}
			else if(income<105224)
			{
				 tax = (45246*0.093)+((43948* 0.06)+(16030*.02));
			}
			else if(income < 644999)
			{
				 tax = (539775*0.113)+((45246*0.093)+(43948* 0.06)+(16030*.02));
			}
			else if(income > 1074996)
			{
				 tax =(income-1074996* 0.133) +(539775*0.113)+((45246*0.093)+(43948* 0.06)+(16030*.02));
			}
		}
		else if(marriageStatus = false)
		{
			if(income<8015)
			{
				 tax =(8015* .01);
			}
			else if(income<19001)
			{
				 tax =(10986* 0.04)+(8015* .01);
			}
			else if(income<41629)
			{
				 tax = (22628* 0.08)+(10986* 0.04)+(8015* .01)
			}
			else if(income<526120)
			{
				 tax = (484491*0.093)+(22628* 0.08)+(10986* 0.04)+(8015* .01);
			}
			else if(income<537498)
			{
				 tax = (11378*0.123)+(484491*0.093)+(22628* 0.08)+(10986* 0.04)+(8015* .01);
			}
			else if(income >1000000)
			{
				 tax = (462502*0.133)+(11378*0.123)+(484491*0.093)+(22628* 0.08)+(10986* 0.04)+(8015* .01);
			}
		}
	}
	if(state.equals 'Colorado')
	{
		 tax = income*0.0463;
	}
	
	if(state.equals 'Connecticut')
	{
		if(marriageStatus)
		{
			if(income<20000)
			{
				 tax = (20000*0.03);
			}
			else if(income<100000)
			{
				 tax =(80000* 0.05)+(20000*0.03);
			}
			else if(income<200000)
			{
				 tax =(100000* 0.055)+(80000* 0.05)+(20000*0.03);
			}
			else if(income < 500000)
			{
				 tax = (30000*0.069)+(100000* 0.055)+(80000* 0.05)+(20000*0.03);
			}
			else if(income >1000000)
			{
				 tax =((income-1000000)* 0.0699)+(30000*0.069)+(100000* 0.055)+(80000* 0.05)+(20000*0.03);
			}
		}
		else if(marriageStatus = false)
		{
			if(income<10000)
			{
				 tax =(10000* 0.03);
			}
			else if(income<50000)
			{
				 tax =(40000* 0.055)+(10000* 0.03);
			}
			else if(income <100000)
			{
				 tax = (50000*0.06)+(40000* 0.055)+(10000* 0.03);
			}
			else if(income<250000)
			{
				 tax = (150000*.069)+(50000*0.06)+(40000* 0.055)+(10000* 0.03);
			}
			else if(income > 500000)
			{
				 tax = ((income-500000)*0.0699);
			}
		}
	}
	
	if(state.equals 'Delaware')
	{
		if(income<2000)
		{
			 rate = 0.022;
		}
		else if(income<10000)
		{
			 rate = 0.048;
		}
		else if(income<25000)
		{
			 rate = 0.052;
		}
		else if(income>60000)
		{
			 rate = 0.066;
		}
	}
	
	if(state.equals 'Florida')
	{
		 rate = 0.0;
	}
	
	if(state.equals 'Georgia')
	{
		if(marriageStatus)
		{
			if(income<1000)
			{
				 rate = 0.01;
			}
			else if(income<3000)
			{
				 rate = 0.02;
			}
			else if(income<7000)
			{
				 rate = 0.04;
			}
			else if(income>10000)
			{
				 rate = 0.06;
			}
		}
		else if(marriageStatus = false)
		{
			if(income <750)
			{
				 rate = 0.01;
			}
			else if(income<2250)
			{
				 rate 0.02;
			}
			else if(income<5250)
			{
				 rate = 0.04;
			}
			else if(income>7000)
			{
				 rate = 0.06;
			}
		}
	}
	
	if(state.equals 'Hawaii')
	{
		if(marriageStatus)
		{
			if(income<4800)
			{
				 rate =0.014;
			}
			else if(income<9600)
			{
				 rate = 0.032;
			}
			else if(income<28800)
			{
				 rate = 0.068;
			}
			else if(income<48000)
			{
				 rate = 0.072;
			}
			else if(income<72000)
			{
				 rate = 0.079;
			}
			else if(income>9600)
			{
				 rate = 0.0825;
			}
		}
		else if(marriageStatus = false)
		{
			if(income<2400)
			{
				 rate = 0.014;
			}
			else if(income<9600)
			{
				 rate = 0.055;
			}
			else if(income<19200)
			{
				 rate = 0.072;
			}
			else if(income<36000)
			{
				 rate = 0.079;
			}
			else if(income>48000)
			{
				 rate = 0.0825;
			}
		}
	}

	if(state.equals 'Idaho')
	{
		if(marriageStatus)
		{
			if(income<2908)
			{
				 rate = 0.016;
			}
			else if(income<8724)
			{
				 rate = 0.0410;
			}
			else if(income<14540)
			{
				 rate = 0.061;
			}
			else if(income>21810)
			{
				 rate = 0.074;
			}
		}
		else if(marriageStatus = false)
		{
			if(income<1454)
			{
				 rate = 0.016;
			}
			else if(income <4362)
			{
				 rate = 0.041;
			}
			else if(income<7270)
			{
				 rate = 0.061;
			}
			else if (income>10905)
			{
				 rate = 0.074;
			}
		}
	}
	
	if(state.equals 'Illinois')
	{
		 rate=0.0375;
	}
	
	if(state.equals 'Indiana;)
	{
		 rate = 0.033;
	}
	
	if(state.equals 'Iowa')
	{
		if(income<1573)
		{
			 rate = 0.0036;
		}
		else if(income<3146)
		{
			 rate = 0.0072;
		}
		else if(income<14157)
		{
			 rate = 0.045;
		}
		else if(income<31460)
		{
			 rate = 0.0648;
		}
		else if(income<47190)
		{
			 rate = 0.068;
		}
		else if(income>70785)
		{
			 rate = 0.0898;
		}
	}

	if(state.equals 'Kansas';)
	{
		if(marriageStatus)
		{
			if(income<30000)
			{
				 rate = 0.029;
			}
			else if(income<60000)
			{
				 rate = 0.049;
			}
			else if(income>60000)
			{
				 rate = 0.052;
			}
		}
		else if(marraigeStatus =false)
		{
			if(income<15000)
			{
				 rate = 0.029;
			}
			else if(income<30000)
			{
				 rate = 0.049;
			}
			else if(income>30000)
			{
				 rate = 0.052;
			}
		}
	}
	
	if(state.equals 'Kentucky';)
	{
		if(income<3000)
		{
			 rate = 0.02;
		}
		else if(income < 4000)
		{
			 rate = 0.03;
		}
		else if(income<5000)
		{
			 rate = 0.04;
		}
		else if(income<8000)
		{
			 rate = 0.05;
		}
		else if(income<75000)
		{
			 rate = 0.058;
		}
		else if(income>75000)
		{
			 rate= 0.06;
		}
	}
	
	if(state.equals 'Louisiana';)
	{
		if(marriageStatus)
		{
			if(income<25000)
			{
				 rate = 0.02;
			}
			if(income<100000)
			{
				 rate = 0.04;
			}
			if(income>100000)
			{
				 rate = 0.06;
			}
		}
		else if(!marriageStatus)
		{
			if(income<12500)
			{
				 rate = 0.02;
			}
			if(income<50000)
			{
				 rate = 0.04;
			}
			if(income>50000)
			{
				 rate = 0.06;
			}
		}
	}
	
	if(state.equals 'Maine';)
	{
		if(marriageStatus)
		{
			if(income<42099)
			{
				 rate =  0.058;
			}
			if(income<74999)
			{
				 rate = 0.0675;
			}
			if(income>74999)
			{
				 rate = 0.0715;
			}
		}
		else if(!marriageStatus)
		{
			if(income<21050)
			{
				 rate = 0.058;
			}
			if(income<50000)
			{
				 rate = 0.0675;
			}
			if(income>=50000)
			{
				 rate = 0.0715;
			}
		}
	}
	
	if(state.equals 'Maryland';)
	{
		if(income<1000)
		{
			 rate=0.02;
		}
		if(income<2000)
		{
			 rate = 0.03;
		}
		if(income<3000)
		{
			 rate = 0.04;
		}
		if(income<100000)
		{
			 rate = 0.0475;
		}
		if(income<150000)
		{
			 rate = 0.0525;
		}
		if(income<250000)
		{
			 rate = 0.0575;
		}
	}
	
	if(state.equals 'Massachusetts';)
	{
		 rate = 0.051;	
	}
	
	if(state.equals 'Michigan';)
	{
		 rate = 0.0425;		
	}
	
	if(state.equals 'Minnesota';)
	{
		if(marriageStatus)
		{
			if(income<37110)
			{
				 rate= 0.0535;
			}
			if(income<147450)
			{
				 rate=0.0705;
			}
			if(income<261510)
			{
				 rate = 0.0785;
			}
			if(income>=261510)
			{
				 rate = 0.0985;
			}
		}
		else if(!marriageStatus)
		{
			if(income<25390)
			{
				 rate = 0.0535;
			}
			if(income<83400)
			{
				 rate = 0.0705;
			}
			if(income<156911)
			{
				 rate = 0.0785;
			}
			if(income>=156911)
			{
				 rate = 0.0985;
			}
		}
	}
	
	if(state.equals 'Mississippi';)
	{
		if(income<5000)
		{
			 rate = 0.03;
		}
		if(income<10000)
		{
			 rate = 0.04;
		}
		if(income>=5000)
		{
			 rate = 0.05;
		}
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

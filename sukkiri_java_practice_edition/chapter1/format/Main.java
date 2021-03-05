final String FORMAT = "%8s %6s 所持金%,5d";
String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
System.out.println(s);
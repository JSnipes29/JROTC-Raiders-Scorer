public class Raiders
{

  public static int score(int pushUps, int sitUps, int mile, boolean isMale)
  {
    if(isMale)
    {
      return sitUpsScore(sitUps) + malePushUpsScore(pushUps) + maleMileScore(mile);
    }
    else
    {
      return sitUpsScore(sitUps) + femalePushUpsScore(pushUps) + femaleMileScore(mile);
    }
    
   
  }
  public static int femaleMileScore(int mile)
  {
    if(mile < 620)
    {
      return 100;
    }
    else if(mile <= 631 && mile > 620) { return 99; }
else if(mile <= 642 && mile > 631) { return 98; }
else if(mile <= 703 && mile > 642) { return 96; }
else if(mile <= 714 && mile > 703) { return 95; }
else if(mile <= 725 && mile > 714) { return 94; }
else if(mile <= 736 && mile > 725) { return 93; }
else if(mile <= 747 && mile > 736) { return 92; }
else if(mile <= 758 && mile > 747) { return 90; }
else if(mile <= 802 && mile > 758) { return 89; }
else if(mile <= 806 && mile > 802) { return 88; }
else if(mile <= 810 && mile > 806) { return 87; }
else if(mile <= 815 && mile > 810) { return 85; }
else if(mile <= 820 && mile > 815) { return 84; }
else if(mile <= 825 && mile > 820) { return 83; }
else if(mile <= 829 && mile > 825) { return 82; }
else if(mile <= 834 && mile > 829) { return 81; }
else if(mile <= 837 && mile > 834) { return 79; }
else if(mile <= 841 && mile > 837) { return 78; }
else if(mile <= 845 && mile > 841) { return 77; }
else if(mile <= 849 && mile > 845) { return 76; }
else if(mile <= 852 && mile > 849) { return 75; }
else if(mile <= 858 && mile > 852) { return 73; }
else if(mile <= 904 && mile > 858) { return 72; }
else if(mile <= 910 && mile > 904) { return 71; }
else if(mile <= 915 && mile > 910) { return 70; }
else if(mile <= 920 && mile > 915) { return 68; }
else if(mile <= 924 && mile > 920) { return 67; }
else if(mile <= 928 && mile > 924) { return 66; }
else if(mile <= 933 && mile > 928) { return 65; }
else if(mile <= 937 && mile > 933) { return 64; }
else if(mile <= 942 && mile > 937) { return 62; }
else if(mile <= 946 && mile > 942) { return 61; }
else if(mile <= 951 && mile > 946) { return 60; }
else if(mile <= 955 && mile > 951) { return 59; }
else if(mile <= 959 && mile > 955) { return 58; }
else if(mile <= 1003 && mile > 959) { return 56; }
else if(mile <= 1008 && mile > 1003) { return 55; }
else if(mile <= 1011 && mile > 1008) { return 54; }
else if(mile <= 1015 && mile > 1011) { return 53; }
else if(mile <= 1019 && mile > 1015) { return 52; }
else if(mile <= 1022 && mile > 1019) { return 50; }
else if(mile <= 1028 && mile > 1022) { return 49; }
else if(mile <= 1034 && mile > 1028) { return 48; }
else if(mile <= 1041 && mile > 1034) { return 47; }
else if(mile <= 1048 && mile > 1041) { return 45; }
else if(mile <= 1052 && mile > 1048) { return 44; }
else if(mile <= 1056 && mile > 1052) { return 43; }
else if(mile <= 1100 && mile > 1056) { return 42; }
else if(mile <= 1105 && mile > 1100) { return 41; }
else if(mile <= 1108 && mile > 1105) { return 39; }
else if(mile <= 1111 && mile > 1108) { return 38; }
else if(mile <= 1114 && mile > 1111) { return 37; }
else if(mile <= 1117 && mile > 1114) { return 36; }
else if(mile <= 1120 && mile > 1117) { return 35; }
else if(mile <= 1130 && mile > 1120) { return 33; }
else if(mile <= 1140 && mile > 1130) { return 32; }
else if(mile <= 1150 && mile > 1140) { return 31; }
else if(mile <= 1200 && mile > 1150) { return 30; }
else if(mile <= 1203 && mile > 1200) { return 28; }
else if(mile <= 1205 && mile > 1203) { return 27; }
else if(mile <= 1208 && mile > 1205) { return 26; }
else if(mile <= 1211 && mile > 1208) { return 25; }
else if(mile <= 1218 && mile > 1211) { return 24; }
else if(mile <= 1225 && mile > 1218) { return 22; }
else if(mile <= 1232 && mile > 1225) { return 21; }
else if(mile <= 1240 && mile > 1232) { return 20; }
else if(mile <= 1246 && mile > 1240) { return 19; }
else if(mile <= 1252 && mile > 1246) { return 18; }
else if(mile <= 1258 && mile > 1252) { return 16; }
else if(mile <= 1303 && mile > 1258) { return 15; }
else if(mile <= 1317 && mile > 1303) { return 14; }
else if(mile <= 1331 && mile > 1317) { return 13; }
else if(mile <= 1345 && mile > 1331) { return 12; }
else if(mile <= 1401 && mile > 1345) { return 10; }
else if(mile <= 1419 && mile > 1401) { return 9; }
else if(mile <= 1438 && mile > 1419) { return 8; }
else if(mile <= 1456 && mile > 1438) { return 7; }
else if(mile <= 1514 && mile > 1456) { return 5; }
else if(mile <= 1744 && mile > 1514) { return 4; }
else if(mile <= 2014 && mile > 1744) { return 3; }
else if(mile <= 2244 && mile > 2014) { return 2; }
else if(mile <= 2514 && mile > 2244) { return 1; }
else if(mile <= 2850 && mile > 2514) { return 0; }
else
{
  return 0;
}
  }
  public static int maleMileScore(int mile)
  {
    if(mile < 446)
    {
      return 100;
    }
    else if(mile <= 456 && mile > 446) { return 99; }
else if(mile <= 506 && mile > 456) { return 97; }
else if(mile <= 516 && mile > 506) { return 96; }
else if(mile <= 526 && mile > 516) { return 94; }
else if(mile <= 536 && mile > 526) { return 93; }
else if(mile <= 546 && mile > 536) { return 92; }
else if(mile <= 557 && mile > 546) { return 90; }
else if(mile <= 559 && mile > 557) { return 89; }
else if(mile <= 601 && mile > 559) { return 88; }
else if(mile <= 604 && mile > 601) { return 86; }
else if(mile <= 606 && mile > 604) { return 85; }
else if(mile <= 609 && mile > 606) { return 83; }
else if(mile <= 611 && mile > 609) { return 82; }
else if(mile <= 614 && mile > 611) { return 81; }
else if(mile <= 617 && mile > 614) { return 79; }
else if(mile <= 619 && mile > 617) { return 78; }
else if(mile <= 621 && mile > 619) { return 77; }
else if(mile <= 623 && mile > 621) { return 75; }
else if(mile <= 625 && mile > 623) { return 74; }
else if(mile <= 628 && mile > 625) { return 72; }
else if(mile <= 630 && mile > 628) { return 71; }
else if(mile <= 632 && mile > 630) { return 70; }
else if(mile <= 635 && mile > 632) { return 68; }
else if(mile <= 637 && mile > 635) { return 67; }
else if(mile <= 639 && mile > 637) { return 66; }
else if(mile <= 642 && mile > 639) { return 64; }
else if(mile <= 644 && mile > 642) { return 63; }
else if(mile <= 647 && mile > 644) { return 61; }
else if(mile <= 650 && mile > 647) { return 60; }
else if(mile <= 652 && mile > 650) { return 59; }
else if(mile <= 654 && mile > 652) { return 57; }
else if(mile <= 656 && mile > 654) { return 56; }
else if(mile <= 658 && mile > 656) { return 54; }
else if(mile <= 700 && mile > 658) { return 53; }
else if(mile <= 702 && mile > 700) { return 52; }
else if(mile <= 704 && mile > 702) { return 50; }
else if(mile <= 707 && mile > 704) { return 49; }
else if(mile <= 709 && mile > 707) { return 48; }
else if(mile <= 712 && mile > 709) { return 46; }
else if(mile <= 714 && mile > 712) { return 45; }
else if(mile <= 717 && mile > 714) { return 43; }
else if(mile <= 720 && mile > 717) { return 42; }
else if(mile <= 723 && mile > 720) { return 41; }
else if(mile <= 726 && mile > 723) { return 39; }
else if(mile <= 729 && mile > 726) { return 38; }
else if(mile <= 732 && mile > 729) { return 37; }
else if(mile <= 735 && mile > 732) { return 35; }
else if(mile <= 738 && mile > 735) { return 34; }
else if(mile <= 744 && mile > 738) { return 32; }
else if(mile <= 750 && mile > 744) { return 31; }
else if(mile <= 752 && mile > 750) { return 30; }
else if(mile <= 800 && mile > 752) { return 28; }
else if(mile <= 804 && mile > 800) { return 27; }
else if(mile <= 808 && mile > 804) { return 26; }
else if(mile <= 813 && mile > 808) { return 24; }
else if(mile <= 817 && mile > 813) { return 23; }
else if(mile <= 821 && mile > 817) { return 21; }
else if(mile <= 825 && mile > 821) { return 20; }
else if(mile <= 834 && mile > 825) { return 19; }
else if(mile <= 842 && mile > 834) { return 18; }
else if(mile <= 850 && mile > 842) { return 17; }
else if(mile <= 858 && mile > 850) { return 14; }
else if(mile <= 906 && mile > 858) { return 13; }
else if(mile <= 914 && mile > 906) { return 12; }
else if(mile <= 923 && mile > 914) { return 10; }
else if(mile <= 936 && mile > 923) { return 9; }
else if(mile <= 949 && mile > 936) { return 8; }
else if(mile <= 1002 && mile > 949) { return 6; }
else if(mile <= 1015 && mile > 1002) { return 5; }
else if(mile <= 1234 && mile > 1015) { return 3; }
else if(mile <= 1400 && mile > 1234) { return 2; }
else if(mile <= 1530 && mile > 1400) { return 1; }
else if(mile <= 1649 && mile > 1530) { return 0; }
else
{
  return 0;
}
  
  }
  public static int sitUpsScore(int sitUps)
  {
    switch(sitUps)
    {
      case 21:
return 10;
case 22:
return 12;
case 23:
return 14;
case 24:
return 15;
case 25:
return 17;
case 26:
return 18;
case 27:
return 20;
case 28:
return 22;
case 29:
return 23;
case 30:
return 25;
case 31:
return 26;
case 32:
return 28;
case 33:
return 30;
case 34:
return 31;
case 35:
return 33;
case 36:
return 34;
case 37:
return 36;
case 38:
return 38;
case 39:
return 39;
case 40:
return 41;
case 41:
return 42;
case 42:
return 44;
case 43:
return 45;
case 44:
return 47;
case 45:
return 49;
case 46:
return 50;
case 47:
return 52;
case 48:
return 54;
case 49:
return 55;
case 50:
return 57;
case 51:
return 58;
case 52:
return 60;
case 53:
return 62;
case 54:
return 63;
case 55:
return 65;
case 56:
return 66;
case 57:
return 68;
case 58:
return 70;
case 59:
return 71;
case 60:
return 73;
case 61:
return 74;
case 62:
return 76;
case 63:
return 78;
case 64:
return 79;
case 65:
return 81;
case 66:
return 82;
case 67:
return 84;
case 68:
return 87;
case 69:
return 88;
case 70:
return 89;
case 71:
return 90;
case 72:
return 92;
case 73:
return 94;
case 74:
return 95;
case 75:
return 97;
case 76:
return 98;
case 77:
return 100;
      default:
        if(sitUps > 77)
      {
        return 100;
      }
        else
        {
          return 0;
        }
    }
  
  }
  public static int malePushUpsScore(int pushUps)
  {
    switch(pushUps)
    {
      case 2:
        return 5;
        
      case 3:
        return 6;
       
        
      case 4:
        return 8;
        
      case 5:
        return 9;
      
      case 6:
        return 10;
      
        
      case 7:
        return 12;
      case 8:
        return 13;
      case 9:
        return 14;
        
      case 10:
        return 16;
      case 11:
        return 17;
       
      case 12:
        return 19;
        case 13:
        return 20;
        
      case 14:
        return 21;
       
        
      case 15:
        return 23;
        
      case 16:
        return 24;
      
      case 17:
        return 26;
      
        
      case 18:
        return 27;
      case 19:
        return 28;
      case 20:
        return 30;
        
      case 21:
        return 31;
      case 22:
        return 32;
       
      case 23:
        return 34;
        case 24:
          return 35;
      case 25:
        return 37;
      case 26:
        return 38;
      case 27:
        return 39;
case 28:
return 41;
case 29:
return 42;
case 30:
return 43;
case 31:
return 45;
case 32:
return 46;
case 33:
return 48;
case 34:
return 49;
case 35:
return 50;
case 36:
return 52;
case 37:
return 53;
case 38:
return 54;
case 39:
return 56;
case 40:
return 57;
case 41:
return 59;
case 42:
return 60;
case 43:
return 61;
case 44:
return 63;
case 45:
return 64;
case 46:
return 66;
case 47:
return 67;
case 48:
return 68;
case 49:
return 70;
case 50:
return 71;
case 51:
return 72;
case 52:
return 74;
case 53:
return 75;
case 54:
return 77;
case 55:
return 78;
case 56:
return 79;
case 57:
return 81;
case 58:
return 82;
case 59:
return 83;
case 60:
return 85;
case 61:
return 86;
case 62:
return 88;
case 63:
return 89;
case 64:
return 90;
case 65:
return 92;
case 66:
return 93;
case 67:
return 94;
case 68:
return 96;
case 69:
return 97;
case 70:
return 99;
case 71:
return 100;
     
       
      default:
        if(pushUps > 71)
      {
        return 100;
        
      }
        else
        {
          return 0;
        }
    }
  
  
  
  }
  public static int femalePushUpsScore(int pushUps)
  {
    switch(pushUps)
    {
    case 2:
return 30;
case 3:
return 32;
case 4:
return 34;
case 5:
return 36;
case 6:
return 37;
case 7:
return 39;
case 8:
return 41;
case 9:
return 43;
case 10:
return 44;
case 11:
return 46;
case 12:
return 48;
case 13:
return 50;
case 14:
return 51;
case 15:
return 53;
case 16:
return 55;
case 17:
return 57;
case 18:
return 58;
case 19:
return 60;
case 20:
return 62;
case 21:
return 63;
case 22:
return 65;
case 23:
return 67;
case 24:
return 69;
case 25:
return 70;
case 26:
return 72;
case 27:
return 74;
case 28:
return 76;
case 29:
return 77;
case 30:
return 79;
case 31:
return 81;
case 32:
return 83;
case 33:
return 84;
case 34:
return 86;
case 35:
return 88;
case 36:
return 90;
case 37:
return 91;
case 38:
return 93;
case 39:
return 95;
case 40:
return 97;
case 41:
return 98;
case 42:
return 100;
    default:
      if(pushUps > 42)
    {
      return 100;
    }
      else
      {
        return 0;
      }
    }
    
  }

}
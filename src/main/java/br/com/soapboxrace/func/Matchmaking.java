package br.com.soapboxrace.func;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import br.com.soapboxrace.srv.HttpSrv;

public class Matchmaking {

	public static String eventA = "<SessionInfo xmlns=\"http://schemas.datacontract.org/2004/07/Victory.Service\" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\"><Challenge><ChallengeId>0</ChallengeId><LeftSize>14</LeftSize><Pattern>1</Pattern><RightSize>50</RightSize></Challenge><EventId>";
	public static String eventB = "</EventId><SessionId>2</SessionId></SessionInfo>";
	public static String eventC;
	public static String eventD = "<EventDefinition><CarClassHash>607077938</CarClassHash><EventId>";
	public static String eventE = "</EventId></EventDefinition>";

	public void launch(String event){
		int launchid = Integer.parseInt(event);
		if (launchid == 2) {eventC = eventA + "2" + eventB;}
		else if (launchid == 3) {eventC = eventA + "3" + eventB;}
		else if (launchid == 5) {eventC = eventA + "5" + eventB;}
		else if (launchid == 6) {eventC = eventA + "6" + eventB;}
		else if (launchid == 7) {eventC = eventA + "7" + eventB;}
		else if (launchid == 8) {eventC = eventA + "8" + eventB;}
		else if (launchid == 9) {eventC = eventA + "9" + eventB;}
		else if (launchid == 10) {eventC = eventA + "10" + eventB;}
		else if (launchid == 11) {eventC = eventA + "11" + eventB;}
		else if (launchid == 12) {eventC = eventA + "12" + eventB;}
		else if (launchid == 13) {eventC = eventA + "13" + eventB;}
		else if (launchid == 14) {eventC = eventA + "14" + eventB;}
		else if (launchid == 15) {eventC = eventA + "15" + eventB;}
		else if (launchid == 16) {eventC = eventA + "16" + eventB;}
		else if (launchid == 17) {eventC = eventA + "17" + eventB;}
		else if (launchid == 18) {eventC = eventA + "18" + eventB;}
		else if (launchid == 19) {eventC = eventA + "19" + eventB;}
		else if (launchid == 20) {eventC = eventA + "20" + eventB;}
		else if (launchid == 21) {eventC = eventA + "21" + eventB;}
		else if (launchid == 22) {eventC = eventA + "22" + eventB;}
		else if (launchid == 23) {eventC = eventA + "23" + eventB;}
		else if (launchid == 24) {eventC = eventA + "24" + eventB;}
		else if (launchid == 25) {eventC = eventA + "25" + eventB;}
		else if (launchid == 26) {eventC = eventA + "26" + eventB;}
		else if (launchid == 27) {eventC = eventA + "27" + eventB;}
		else if (launchid == 28) {eventC = eventA + "28" + eventB;}
		else if (launchid == 29) {eventC = eventA + "29" + eventB;}
		else if (launchid == 30) {eventC = eventA + "30" + eventB;}
		else if (launchid == 31) {eventC = eventA + "31" + eventB;}
		else if (launchid == 32) {eventC = eventA + "32" + eventB;}
		else if (launchid == 33) {eventC = eventA + "33" + eventB;}
		else if (launchid == 34) {eventC = eventA + "34" + eventB;}
		else if (launchid == 35) {eventC = eventA + "35" + eventB;}
		else if (launchid == 36) {eventC = eventA + "36" + eventB;}
		else if (launchid == 37) {eventC = eventA + "37" + eventB;}
		else if (launchid == 38) {eventC = eventA + "38" + eventB;}
		else if (launchid == 39) {eventC = eventA + "39" + eventB;}
		else if (launchid == 40) {eventC = eventA + "40" + eventB;}
		else if (launchid == 41) {eventC = eventA + "41" + eventB;}
		else if (launchid == 42) {eventC = eventA + "42" + eventB;}
		else if (launchid == 43) {eventC = eventA + "43" + eventB;}
		else if (launchid == 44) {eventC = eventA + "44" + eventB;}
		else if (launchid == 45) {eventC = eventA + "45" + eventB;}
		else if (launchid == 46) {eventC = eventA + "46" + eventB;}
		else if (launchid == 47) {eventC = eventA + "47" + eventB;}
		else if (launchid == 48) {eventC = eventA + "48" + eventB;}
		else if (launchid == 49) {eventC = eventA + "49" + eventB;}
		else if (launchid == 50) {eventC = eventA + "50" + eventB;}
		else if (launchid == 51) {eventC = eventA + "51" + eventB;}
		else if (launchid == 52) {eventC = eventA + "52" + eventB;}
		else if (launchid == 53) {eventC = eventA + "53" + eventB;}
		else if (launchid == 54) {eventC = eventA + "54" + eventB;}
		else if (launchid == 55) {eventC = eventA + "55" + eventB;}
		else if (launchid == 56) {eventC = eventA + "56" + eventB;}
		else if (launchid == 57) {eventC = eventA + "57" + eventB;}
		else if (launchid == 60) {eventC = eventA + HttpSrv.iEvent + eventB;}
		else if (launchid == 61) {eventC = eventA + "61" + eventB;}
		else if (launchid == 71) {eventC = eventA + "71" + eventB;}
		else if (launchid == 72) {eventC = eventA + "72" + eventB;}
		else if (launchid == 76) {eventC = eventA + "76" + eventB;}
		else if (launchid == 77) {eventC = eventA + "77" + eventB;}
		else if (launchid == 78) {eventC = eventA + "78" + eventB;}
		else if (launchid == 79) {eventC = eventA + "79" + eventB;}
		else if (launchid == 80) {eventC = eventA + "80" + eventB;}
		else if (launchid == 81) {eventC = eventA + "81" + eventB;}
		else if (launchid == 82) {eventC = eventA + "82" + eventB;}
		else if (launchid == 83) {eventC = eventA + "83" + eventB;}
		else if (launchid == 84) {eventC = eventA + "84" + eventB;}
		else if (launchid == 85) {eventC = eventA + "85" + eventB;}
		else if (launchid == 86) {eventC = eventA + "86" + eventB;}
		else if (launchid == 87) {eventC = eventA + "87" + eventB;}
		else if (launchid == 88) {eventC = eventA + "88" + eventB;}
		else if (launchid == 89) {eventC = eventA + "89" + eventB;}
		else if (launchid == 91) {eventC = eventA + "91" + eventB;}
		else if (launchid == 92) {eventC = eventA + "92" + eventB;}
		else if (launchid == 93) {eventC = eventA + "93" + eventB;}
		else if (launchid == 94) {eventC = eventA + "94" + eventB;}
		else if (launchid == 95) {eventC = eventA + "95" + eventB;}
		else if (launchid == 96) {eventC = eventA + "96" + eventB;}
		else if (launchid == 97) {eventC = eventA + "97" + eventB;}
		else if (launchid == 98) {eventC = eventA + "98" + eventB;}
		else if (launchid == 99) {eventC = eventA + "99" + eventB;}
		else if (launchid == 100) {eventC = eventA + "100" + eventB;}
		else if (launchid == 101) {eventC = eventA + "382" + eventB;}
		else if (launchid == 102) {eventC = eventA + "102" + eventB;}
		else if (launchid == 103) {eventC = eventA + "103" + eventB;}
		else if (launchid == 104) {eventC = eventA + "104" + eventB;}
		else if (launchid == 105) {eventC = eventA + "105" + eventB;}
		else if (launchid == 106) {eventC = eventA + "106" + eventB;}
		else if (launchid == 107) {eventC = eventA + "107" + eventB;}
		else if (launchid == 108) {eventC = eventA + "108" + eventB;}
		else if (launchid == 109) {eventC = eventA + "109" + eventB;}
		else if (launchid == 110) {eventC = eventA + "110" + eventB;}
		else if (launchid == 111) {eventC = eventA + "111" + eventB;}
		else if (launchid == 112) {eventC = eventA + "112" + eventB;}
		else if (launchid == 113) {eventC = eventA + "113" + eventB;}
		else if (launchid == 114) {eventC = eventA + "114" + eventB;}
		else if (launchid == 115) {eventC = eventA + "115" + eventB;}
		else if (launchid == 116) {eventC = eventA + "116" + eventB;}
		else if (launchid == 117) {eventC = eventA + "205" + eventB;}
		else if (launchid == 118) {eventC = eventA + "118" + eventB;}
		else if (launchid == 119) {eventC = eventA + "119" + eventB;}
		else if (launchid == 120) {eventC = eventA + "120" + eventB;}
		else if (launchid == 121) {eventC = eventA + "121" + eventB;}
		else if (launchid == 122) {eventC = eventA + "122" + eventB;}
		else if (launchid == 123) {eventC = eventA + "123" + eventB;}
		else if (launchid == 124) {eventC = eventA + "124" + eventB;}
		else if (launchid == 125) {eventC = eventA + "125" + eventB;}
		else if (launchid == 126) {eventC = eventA + "126" + eventB;}
		else if (launchid == 127) {eventC = eventA + "127" + eventB;}
		else if (launchid == 128) {eventC = eventA + "128" + eventB;}
		else if (launchid == 129) {eventC = eventA + "129" + eventB;}
		else if (launchid == 130) {eventC = eventA + "130" + eventB;}
		else if (launchid == 131) {eventC = eventA + "131" + eventB;}
		else if (launchid == 132) {eventC = eventA + "132" + eventB;}
		else if (launchid == 133) {eventC = eventA + "133" + eventB;}
		else if (launchid == 134) {eventC = eventA + "134" + eventB;}
		else if (launchid == 135) {eventC = eventA + "135" + eventB;}
		else if (launchid == 136) {eventC = eventA + "136" + eventB;}
		else if (launchid == 137) {eventC = eventA + "137" + eventB;}
		else if (launchid == 138) {eventC = eventA + "138" + eventB;}
		else if (launchid == 139) {eventC = eventA + "139" + eventB;}
		else if (launchid == 140) {eventC = eventA + "140" + eventB;}
		else if (launchid == 141) {eventC = eventA + "141" + eventB;}
		else if (launchid == 142) {eventC = eventA + "142" + eventB;}
		else if (launchid == 143) {eventC = eventA + "143" + eventB;}
		else if (launchid == 144) {eventC = eventA + "144" + eventB;}
		else if (launchid == 145) {eventC = eventA + "145" + eventB;}
		else if (launchid == 146) {eventC = eventA + "146" + eventB;}
		else if (launchid == 147) {eventC = eventA + "147" + eventB;}
		else if (launchid == 148) {eventC = eventA + "148" + eventB;}
		else if (launchid == 149) {eventC = eventA + "149" + eventB;}
		else if (launchid == 150) {eventC = eventA + "150" + eventB;}
		else if (launchid == 151) {eventC = eventA + "151" + eventB;}
		else if (launchid == 152) {eventC = eventA + "152" + eventB;}
		else if (launchid == 153) {eventC = eventA + "153" + eventB;}
		else if (launchid == 154) {eventC = eventA + "154" + eventB;}
		else if (launchid == 155) {eventC = eventA + "155" + eventB;}
		else if (launchid == 156) {eventC = eventA + "156" + eventB;}
		else if (launchid == 157) {eventC = eventA + "157" + eventB;}
		else if (launchid == 158) {eventC = eventA + "158" + eventB;}
		else if (launchid == 159) {eventC = eventA + "159" + eventB;}
		else if (launchid == 160) {eventC = eventA + "160" + eventB;}
		else if (launchid == 161) {eventC = eventA + "161" + eventB;}
		else if (launchid == 162) {eventC = eventA + "162" + eventB;}
		else if (launchid == 163) {eventC = eventA + "163" + eventB;}
		else if (launchid == 164) {eventC = eventA + "164" + eventB;}
		else if (launchid == 165) {eventC = eventA + "165" + eventB;}
		else if (launchid == 166) {eventC = eventA + "166" + eventB;}
		else if (launchid == 167) {eventC = eventA + "167" + eventB;}
		else if (launchid == 168) {eventC = eventA + "168" + eventB;}
		else if (launchid == 169) {eventC = eventA + "169" + eventB;}
		else if (launchid == 170) {eventC = eventA + "170" + eventB;}
		else if (launchid == 171) {eventC = eventA + "171" + eventB;}
		else if (launchid == 172) {eventC = eventA + "172" + eventB;}
		else if (launchid == 173) {eventC = eventA + "173" + eventB;}
		else if (launchid == 174) {eventC = eventA + "174" + eventB;}
		else if (launchid == 175) {eventC = eventA + "175" + eventB;}
		else if (launchid == 176) {eventC = eventA + "176" + eventB;}
		else if (launchid == 177) {eventC = eventA + "177" + eventB;}
		else if (launchid == 178) {eventC = eventA + "178" + eventB;}
		else if (launchid == 179) {eventC = eventA + "179" + eventB;}
		else if (launchid == 180) {eventC = eventA + "180" + eventB;}
		else if (launchid == 181) {eventC = eventA + "181" + eventB;}
		else if (launchid == 182) {eventC = eventA + "182" + eventB;}
		else if (launchid == 183) {eventC = eventA + "183" + eventB;}
		else if (launchid == 184) {eventC = eventA + "184" + eventB;}
		else if (launchid == 185) {eventC = eventA + "185" + eventB;}
		else if (launchid == 186) {eventC = eventA + "186" + eventB;}
		else if (launchid == 187) {eventC = eventA + "187" + eventB;}
		else if (launchid == 188) {eventC = eventA + "188" + eventB;}
		else if (launchid == 189) {eventC = eventA + "189" + eventB;}
		else if (launchid == 190) {eventC = eventA + "190" + eventB;}
		else if (launchid == 191) {eventC = eventA + "191" + eventB;}
		else if (launchid == 192) {eventC = eventA + "192" + eventB;}
		else if (launchid == 193) {eventC = eventA + "193" + eventB;}
		else if (launchid == 194) {eventC = eventA + "194" + eventB;}
		else if (launchid == 195) {eventC = eventA + "195" + eventB;}
		else if (launchid == 196) {eventC = eventA + "196" + eventB;}
		else if (launchid == 197) {eventC = eventA + "197" + eventB;}
		else if (launchid == 198) {eventC = eventA + "198" + eventB;}
		else if (launchid == 199) {eventC = eventA + "199" + eventB;}
		else if (launchid == 200) {eventC = eventA + "200" + eventB;}
		else if (launchid == 201) {eventC = eventA + "201" + eventB;}
		else if (launchid == 202) {eventC = eventA + "202" + eventB;}
		else if (launchid == 203) {eventC = eventA + "203" + eventB;}
		else if (launchid == 204) {eventC = eventA + "204" + eventB;}
		else if (launchid == 205) {eventC = eventA + "117" + eventB;}
		else if (launchid == 206) {eventC = eventA + "206" + eventB;}
		else if (launchid == 207) {eventC = eventA + "207" + eventB;}
		else if (launchid == 208) {eventC = eventA + "208" + eventB;}
		else if (launchid == 209) {eventC = eventA + "209" + eventB;}
		else if (launchid == 210) {eventC = eventA + "232" + eventB;}
		else if (launchid == 211) {eventC = eventA + "211" + eventB;}
		else if (launchid == 212) {eventC = eventA + "212" + eventB;}
		else if (launchid == 213) {eventC = eventA + "213" + eventB;}
		else if (launchid == 214) {eventC = eventA + "269" + eventB;}
		else if (launchid == 215) {eventC = eventA + "215" + eventB;}
		else if (launchid == 216) {eventC = eventA + "216" + eventB;}
		else if (launchid == 217) {eventC = eventA + "217" + eventB;}
		else if (launchid == 218) {eventC = eventA + "218" + eventB;}
		else if (launchid == 219) {eventC = eventA + "219" + eventB;}
		else if (launchid == 221) {eventC = eventA + "222" + eventB;}
		else if (launchid == 222) {eventC = eventA + "221" + eventB;}
		else if (launchid == 223) {eventC = eventA + "223" + eventB;}
		else if (launchid == 224) {eventC = eventA + "224" + eventB;}
		else if (launchid == 225) {eventC = eventA + "225" + eventB;}
		else if (launchid == 226) {eventC = eventA + "226" + eventB;}
		else if (launchid == 227) {eventC = eventA + "227" + eventB;}
		else if (launchid == 228) {eventC = eventA + "228" + eventB;}
		else if (launchid == 232) {eventC = eventA + "210" + eventB;}
		else if (launchid == 233) {eventC = eventA + "294" + eventB;}
		else if (launchid == 235) {eventC = eventA + "235" + eventB;}
		else if (launchid == 239) {eventC = eventA + "239" + eventB;}
		else if (launchid == 240) {eventC = eventA + "240" + eventB;}
		else if (launchid == 241) {eventC = eventA + "241" + eventB;}
		else if (launchid == 242) {eventC = eventA + "242" + eventB;}
		else if (launchid == 243) {eventC = eventA + "243" + eventB;}
		else if (launchid == 250) {eventC = eventA + "283" + eventB;}
		else if (launchid == 251) {eventC = eventA + "251" + eventB;}
		else if (launchid == 252) {eventC = eventA + "252" + eventB;}
		else if (launchid == 259) {eventC = eventA + "259" + eventB;}
		else if (launchid == 260) {eventC = eventA + "260" + eventB;}
		else if (launchid == 261) {eventC = eventA + "261" + eventB;}
		else if (launchid == 262) {eventC = eventA + "262" + eventB;}
		else if (launchid == 263) {eventC = eventA + "263" + eventB;}
		else if (launchid == 264) {eventC = eventA + "264" + eventB;}
		else if (launchid == 265) {eventC = eventA + "268" + eventB;}
		else if (launchid == 266) {eventC = eventA + "266" + eventB;}
		else if (launchid == 267) {eventC = eventA + "267" + eventB;}
		else if (launchid == 268) {eventC = eventA + "265" + eventB;}
		else if (launchid == 269) {eventC = eventA + "214" + eventB;}
		else if (launchid == 270) {eventC = eventA + "351" + eventB;}
		else if (launchid == 271) {eventC = eventA + "271" + eventB;}
		else if (launchid == 272) {eventC = eventA + "272" + eventB;}
		else if (launchid == 273) {eventC = eventA + "273" + eventB;}
		else if (launchid == 274) {eventC = eventA + "274" + eventB;}
		else if (launchid == 275) {eventC = eventA + "275" + eventB;}
		else if (launchid == 276) {eventC = eventA + "276" + eventB;}
		else if (launchid == 277) {eventC = eventA + "277" + eventB;}
		else if (launchid == 278) {eventC = eventA + "278" + eventB;}
		else if (launchid == 279) {eventC = eventA + "279" + eventB;}
		else if (launchid == 280) {eventC = eventA + "280" + eventB;}
		else if (launchid == 282) {eventC = eventA + "282" + eventB;}
		else if (launchid == 283) {eventC = eventA + "250" + eventB;}
		else if (launchid == 287) {eventC = eventA + "287" + eventB;}
		else if (launchid == 288) {eventC = eventA + "288" + eventB;}
		else if (launchid == 289) {eventC = eventA + "289" + eventB;}
		else if (launchid == 290) {eventC = eventA + "290" + eventB;}
		else if (launchid == 291) {eventC = eventA + "291" + eventB;}
		else if (launchid == 292) {eventC = eventA + "292" + eventB;}
		else if (launchid == 293) {eventC = eventA + "293" + eventB;}
		else if (launchid == 294) {eventC = eventA + "233" + eventB;}
		else if (launchid == 295) {eventC = eventA + "295" + eventB;}
		else if (launchid == 296) {eventC = eventA + "296" + eventB;}
		else if (launchid == 297) {eventC = eventA + "297" + eventB;}
		else if (launchid == 298) {eventC = eventA + "298" + eventB;}
		else if (launchid == 299) {eventC = eventA + "299" + eventB;}
		else if (launchid == 300) {eventC = eventA + "300" + eventB;}
		else if (launchid == 301) {eventC = eventA + "301" + eventB;}
		else if (launchid == 302) {eventC = eventA + "302" + eventB;}
		else if (launchid == 303) {eventC = eventA + "303" + eventB;}
		else if (launchid == 304) {eventC = eventA + "304" + eventB;}
		else if (launchid == 305) {eventC = eventA + "305" + eventB;}
		else if (launchid == 306) {eventC = eventA + "306" + eventB;}
		else if (launchid == 307) {eventC = eventA + "307" + eventB;}
		else if (launchid == 308) {eventC = eventA + "308" + eventB;}
		else if (launchid == 309) {eventC = eventA + "309" + eventB;}
		else if (launchid == 310) {eventC = eventA + "310" + eventB;}
		else if (launchid == 311) {eventC = eventA + "311" + eventB;}
		else if (launchid == 312) {eventC = eventA + "312" + eventB;}
		else if (launchid == 313) {eventC = eventA + "313" + eventB;}
		else if (launchid == 314) {eventC = eventA + "314" + eventB;}
		else if (launchid == 315) {eventC = eventA + "315" + eventB;}
		else if (launchid == 317) {eventC = eventA + "317" + eventB;}
		else if (launchid == 318) {eventC = eventA + "318" + eventB;}
		else if (launchid == 336) {eventC = eventA + "336" + eventB;}
		else if (launchid == 337) {eventC = eventA + "369" + eventB;}
		else if (launchid == 338) {eventC = eventA + "338" + eventB;}
		else if (launchid == 339) {eventC = eventA + "339" + eventB;}
		else if (launchid == 340) {eventC = eventA + "340" + eventB;}
		else if (launchid == 344) {eventC = eventA + "344" + eventB;}
		else if (launchid == 347) {eventC = eventA + "347" + eventB;}
		else if (launchid == 348) {eventC = eventA + "348" + eventB;}
		else if (launchid == 350) {eventC = eventA + "350" + eventB;}
		else if (launchid == 351) {eventC = eventA + "270" + eventB;}
		else if (launchid == 353) {eventC = eventA + "353" + eventB;}
		else if (launchid == 355) {eventC = eventA + "355" + eventB;}
		else if (launchid == 356) {eventC = eventA + "356" + eventB;}
		else if (launchid == 357) {eventC = eventA + "357" + eventB;}
		else if (launchid == 359) {eventC = eventA + "359" + eventB;}
		else if (launchid == 360) {eventC = eventA + "360" + eventB;}
		else if (launchid == 362) {eventC = eventA + "362" + eventB;}
		else if (launchid == 366) {eventC = eventA + "366" + eventB;}
		else if (launchid == 367) {eventC = eventA + "367" + eventB;}
		else if (launchid == 368) {eventC = eventA + "368" + eventB;}
		else if (launchid == 369) {eventC = eventA + "337" + eventB;}
		else if (launchid == 370) {eventC = eventA + "370" + eventB;}
		else if (launchid == 374) {eventC = eventA + HttpSrv.iEvent + eventB;}
		else if (launchid == 375) {eventC = eventA + "375" + eventB;}
		else if (launchid == 376) {eventC = eventA + "376" + eventB;}
		else if (launchid == 377) {eventC = eventA + "377" + eventB;}
		else if (launchid == 378) {eventC = eventA + HttpSrv.iEvent + eventB;}
		else if (launchid == 379) {eventC = eventA + "379" + eventB;}
		else if (launchid == 380) {eventC = eventA + "380" + eventB;}
		else if (launchid == 382) {eventC = eventA + "101" + eventB;}
		else if (launchid == 383) {eventC = eventA + "383" + eventB;}
		else if (launchid == 384) {eventC = eventA + "384" + eventB;}
		else if (launchid == 385) {eventC = eventA + "385" + eventB;}
		else if (launchid == 386) {eventC = eventA + "386" + eventB;}
		else if (launchid == 387) {eventC = eventA + "387" + eventB;}
		else if (launchid == 388) {eventC = eventA + "388" + eventB;}
		else if (launchid == 389) {eventC = eventA + "389" + eventB;}
		else if (launchid == 390) {eventC = eventA + "390" + eventB;}
		else if (launchid == 391) {eventC = eventA + "391" + eventB;}
		else if (launchid == 392) {eventC = eventA + "392" + eventB;}
		else if (launchid == 393) {eventC = eventA + "393" + eventB;}
		else if (launchid == 498) {eventC = eventA + "498" + eventB;}
		else if (launchid == 499) {eventC = eventA + "499" + eventB;}
		else if (launchid == 500) {eventC = eventA + "500" + eventB;}
		else if (launchid == 501) {eventC = eventA + "501" + eventB;}
		else if (launchid == 502) {eventC = eventA + "502" + eventB;}
		else if (launchid == 503) {eventC = eventA + "503" + eventB;}
		else if (launchid == 504) {eventC = eventA + "504" + eventB;}
		else if (launchid == 506) {eventC = eventA + "506" + eventB;}
		else if (launchid == 507) {eventC = eventA + "507" + eventB;}
		else if (launchid == 509) {eventC = eventA + "509" + eventB;}
		else if (launchid == 510) {eventC = eventA + "510" + eventB;}
		else if (launchid == 511) {eventC = eventA + "511" + eventB;}
		else if (launchid == 513) {eventC = eventA + "513" + eventB;}
		else if (launchid == 515) {eventC = eventA + "515" + eventB;}
		else if (launchid == 516) {eventC = eventA + "516" + eventB;}
		else if (launchid == 517) {eventC = eventA + "517" + eventB;}
		else if (launchid == 521) {eventC = eventA + "521" + eventB;}
		else if (launchid == 524) {eventC = eventA + "524" + eventB;}
		else if (launchid == 525) {eventC = eventA + "525" + eventB;}
		else if (launchid == 526) {eventC = eventA + "526" + eventB;}
		else if (launchid == 527) {eventC = eventA + "527" + eventB;}
		else if (launchid == 529) {eventC = eventA + "529" + eventB;}
		else if (launchid == 530) {eventC = eventA + "530" + eventB;}
		else if (launchid == 531) {eventC = eventA + "531" + eventB;}
		else if (launchid == 532) {eventC = eventA + "532" + eventB;}
		else if (launchid == 533) {eventC = eventA + "533" + eventB;}
		else if (launchid == 534) {eventC = eventA + "534" + eventB;}
		else if (launchid == 535) {eventC = eventA + "535" + eventB;}
		else eventC = eventA + "48" + eventB;
		Functions.answerData = eventC;
		return;
	}
	
	public static String getLevelEvents() throws ParserConfigurationException, SAXException, IOException{
		Functions fx = new Functions();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<EventsPacket><Events>");

		if (fx.GetLevel() == 1)
		stringBuilder.append(eventD + "42" + eventE
							+eventD + "44" + eventE
							+eventD + "46" + eventE
							+eventD + "48" + eventE);
		if (fx.GetLevel() >= 2)
		stringBuilder.append(eventD + "41" + eventE
							+eventD + "43" + eventE
							+eventD + "45" + eventE
							+eventD + "47" + eventE
							+eventD + "60" + eventE
							+eventD + "374" + eventE
							+eventD + "378" + eventE);
		if (fx.GetLevel() >= 3)
		stringBuilder.append(eventD + "2" + eventE
							+eventD + "72" + eventE
							+eventD + "299" + eventE
							+eventD + "19" + eventE
							+eventD + "289" + eventE
							+eventD + "158" + eventE
							+eventD + "533" + eventE
							+eventD + "35" + eventE
							+eventD + "526" + eventE
							+eventD + "535" + eventE
							+eventD + "357" + eventE);
		if (fx.GetLevel() >= 5)
		stringBuilder.append(eventD + "383" + eventE
							+eventD + "116" + eventE
							+eventD + "27" + eventE
							+eventD + "355" + eventE
							+eventD + "87" + eventE
							+eventD + "175" + eventE
							+eventD + "307" + eventE
							+eventD + "81" + eventE
							+eventD + "8" + eventE
							+eventD + "18" + eventE
							+eventD + "52" + eventE
							+eventD + "156" + eventE
							+eventD + "368" + eventE);
		if (fx.GetLevel() >= 10)
		stringBuilder.append(eventD + "384" + eventE
							+eventD + "80" + eventE
							+eventD + "367" + eventE
							+eventD + "350" + eventE
							+eventD + "147" + eventE
							+eventD + "279" + eventE
							+eventD + "36" + eventE
							+eventD + "360" + eventE
							+eventD + "32" + eventE
							+eventD + "534" + eventE
							+eventD + "165" + eventE
							+eventD + "183" + eventE
							+eventD + "370" + eventE);
		if (fx.GetLevel() >= 15)
		stringBuilder.append(eventD + "385" + eventE
							+eventD + "290" + eventE
							+eventD + "97" + eventE
							+eventD + "33" + eventE
							+eventD + "10" + eventE
							+eventD + "166" + eventE
							+eventD + "20" + eventE
							+eventD + "22" + eventE
							+eventD + "83" + eventE
							+eventD + "38" + eventE
							+eventD + "194" + eventE
							+eventD + "202" + eventE
							+eventD + "375" + eventE);
		if (fx.GetLevel() >= 20)
		stringBuilder.append(eventD + "386" + eventE
							+eventD + "28" + eventE
							+eventD + "292" + eventE
							+eventD + "5" + eventE
							+eventD + "521" + eventE
							+eventD + "55" + eventE
							+eventD + "301" + eventE
							+eventD + "218" + eventE
							+eventD + "379" + eventE
							+eventD + "9" + eventE
							+eventD + "499" + eventE
							+eventD + "500" + eventE
							+eventD + "376" + eventE);
		if (fx.GetLevel() >= 25)
		stringBuilder.append(eventD + "387" + eventE
							+eventD + "296" + eventE
							+eventD + "37" + eventE
							+eventD + "57" + eventE
							+eventD + "77" + eventE
							+eventD + "144" + eventE
							+eventD + "78" + eventE
							+eventD + "295" + eventE
							+eventD + "531" + eventE
							+eventD + "198" + eventE
							+eventD + "501" + eventE
							+eventD + "502" + eventE
							+eventD + "377" + eventE);
		if (fx.GetLevel() >= 30)
		stringBuilder.append(eventD + "388" + eventE
							+eventD + "61" + eventE
							+eventD + "169" + eventE
							+eventD + "23" + eventE
							+eventD + "108" + eventE
							+eventD + "29" + eventE
							+eventD + "287" + eventE
							+eventD + "148" + eventE
							+eventD + "317" + eventE
							+eventD + "13" + eventE
							+eventD + "503" + eventE
							+eventD + "504" + eventE
							+eventD + "391" + eventE);
		if (fx.GetLevel() >= 35)
		stringBuilder.append(eventD + "389" + eventE
							+eventD + "53" + eventE
							+eventD + "109" + eventE
							+eventD + "366" + eventE
							+eventD + "314" + eventE
							+eventD + "219" + eventE
							+eventD + "25" + eventE
							+eventD + "120" + eventE
							+eventD + "277" + eventE
							+eventD + "506" + eventE
							+eventD + "507" + eventE
							+eventD + "392" + eventE);
		if (fx.GetLevel() >= 40)
		stringBuilder.append(eventD + "393" + eventE
							+eventD + "7" + eventE
							+eventD + "280" + eventE
							+eventD + "157" + eventE
							+eventD + "49" + eventE
							+eventD + "76" + eventE
							+eventD + "146" + eventE
							+eventD + "17" + eventE
							+eventD + "16" + eventE
							+eventD + "509" + eventE
							+eventD + "510" + eventE);
		if (fx.GetLevel() >= 45)
		stringBuilder.append(eventD + "498" + eventE
							+eventD + "303" + eventE
							+eventD + "362" + eventE
							+eventD + "71" + eventE
							+eventD + "11" + eventE
							+eventD + "196" + eventE
							+eventD + "50" + eventE
							+eventD + "39" + eventE
							+eventD + "31" + eventE
							+eventD + "511" + eventE
							+eventD + "513" + eventE);
		if (fx.GetLevel() >= 50)
		stringBuilder.append(eventD + "117" + eventE
							+eventD + "532" + eventE
							+eventD + "309" + eventE
							+eventD + "133" + eventE
							+eventD + "30" + eventE
							+eventD + "131" + eventE
							+eventD + "79" + eventE
							+eventD + "98" + eventE
							+eventD + "515" + eventE
							+eventD + "516" + eventE
							+eventD + "221" + eventE);
		if (fx.GetLevel() >= 60)
		stringBuilder.append(eventD + "232" + eventE
							+eventD + "529" + eventE
							+eventD + "56" + eventE
							+eventD + "21" + eventE
							+eventD + "298" + eventE
							+eventD + "6" + eventE
							+eventD + "209" + eventE
							+eventD + "85" + eventE
							+eventD + "517" + eventE
							+eventD + "524" + eventE
							+eventD + "525" + eventE
							+eventD + "265" + eventE);
		if (fx.GetLevel() >= 70)
		stringBuilder.append(eventD + "283" + eventE
							+eventD + "3" + eventE
							+eventD + "527" + eventE
							+eventD + "26" + eventE
							+eventD + "54" + eventE
							+eventD + "104" + eventE
							+eventD + "14" + eventE
							+eventD + "305" + eventE
							+eventD + "294" + eventE);
		if (fx.GetLevel() >= 80)
		stringBuilder.append(eventD + "351" + eventE
							+eventD + "159" + eventE
							+eventD + "24" + eventE
							+eventD + "51" + eventE
							+eventD + "145" + eventE
							+eventD + "252" + eventE
							+eventD + "308" + eventE
							+eventD + "12" + eventE
							+eventD + "369" + eventE);
		if (fx.GetLevel() >= 90)
		stringBuilder.append(eventD + "382" + eventE
							+eventD + "135" + eventE
							+eventD + "530" + eventE
							+eventD + "34" + eventE
							+eventD + "82" + eventE
							+eventD + "302" + eventE
							+eventD + "294" + eventE
							+eventD + "95" + eventE);
		if (fx.GetLevel() >= 99)
		stringBuilder.append(eventD + "214" + eventE);

		stringBuilder.append("</Events></EventsPacket>");
		return stringBuilder.toString();
	}
}

Feature: Register Feature

  @valid_register
  Scenario: Registrasi
    Given User open link WebAltaShop
    When User navigate to register page
    And User fill Registration Form
    And User click Register Button
    Then User succesfull create new account

  @invalid_register
  Scenario Outline: Test Username with some condition
    Given User open link WebAltaShop
    When User navigate to register page
    And User enters <Name>, <Email> and <Password>
    And User click Register Button
    Then User succesfull create new account

    Examples: 
      | Name                         			 																																						 | Email                       					| Password    					|
      | Anitagodblesssus@gmail.com                                                                                     | anita1213siagangmail.com	      			| Anitasiagian123       |
      | Anita02231wqsdasdasd02020                                                                                      | anita!!121/_22!@gmail.comss  		  	| dsddsdsdsdd 					|
      | Anita022323                  			 																																					   | anita!!!12_2/131!!@gmail.comss 			| dsddsdsdsdd 					|
      | A						                  																																								 | aniasiag23ian/1211_@gmail.com				| a  										|
      | ___01_						                  																																					 | anasiagian1213.21_@gmail.com					| 101__  								|
			| anita__!!				                  																																						 | 12anitasiagian1/21321_@gmail.com			| 101__  								|
			| !				                  																																										 | 123anitasiagian1/21321_@gmail.com		| _  										|
			| @_++				                  																																								 | 123anitasiagian12.1321_@gmail.com		| _@@@  								|
			| Anita01@				                  																																						 | 123anitasiagian121/321_@gmail.com		| Anita01@@ 						|
			| @_++				                  																																								 | 123anitasiagian1213/21_@gmail.com		| _@@@  								|
			|!				                  																																										 | 123anitasiagian12132/1_@gmail.com		| _  										|
			| @_++				                  																																								 | 123anitasiagian121321/_@gmail.com		| _@@@ 								  |
			| !				                  																																										 | 123anitasiagian121321_/@gmail.com		| _ 										|
			| ANITA			                  																																									 | 123anitasiagian121321_/@gmail.com		| ANITALASMARIASIAGIAN  |
			| ANITA			                  																																									 | 123anitasiagian121321_/@gmail.com		| ANITALASMARIASIAGIAN  |
			| anitasiagiandiitigati		                  																																		 | 123anitasiagian121321_/@gmail.com		| anitasiagiandiitigati |
			| anita dtiga ti 2019 ta sepuluh@gmail.comanitalasmariasiagiankelompoktugasakhirsepuluhanitalasmariasiagian123456| 1223anitasiagian121321_/@gmail.com		| anitasiagiandiitigati |	                  																
  
  @invalid_register1
  Scenario Outline: Test Username with many condition
    Given User open link WebAltaShop
    When User navigate to register page
    And User enters <Name>, <Email> and <Password>
    And User click Register Button
    Then I have notification danger

    Examples: 
      | Name          | Email                    | Password |
      | Anita Siagian | anitasiagian11@gmail.com | anita    |

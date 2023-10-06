Feature: voy a tener suerte
click on the button voy a tener suerte

Scenario: Click voy a tener suerte in Google
Given The user is in the main Google
When click on voy a tener suerte
Then System shows page Doodles

Scenario: Search by image in Google
Given The user is in the main Google
When make click on the icon camera
And load an image from my computer
Then search should show result base on my image loaded
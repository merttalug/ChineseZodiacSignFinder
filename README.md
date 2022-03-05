# ChineseZodiacSignFinder
 A program that finds the signs of the Chinese zodiac according to the birth year information it receives as input from the users.

## What is the Chinese Astrology ?
Chinese astrology is a type of astrology that has been used for 4000 thousand years and describes people with 12 different signs and symbols. The Chinese Zodiac is an animal ring in which these 12 signs are evenly spaced (10 degrees wide) and have little to do with the stars.

![zodiac](https://images.chinahighlights.com/allpicture/2021/09/f372e03de36e475b933aa81e.jpg)

## How is the Chinese Zodiac calculated ?
When calculating the Chinese zodiac, the year of birth of the person is found according to the 12 and its mode.

* Birth Year 12% = 0 ➜ Monkey
* Birth Year 12% = 1 ➜ Rooster
* Birth Year 12% = 2 ➜ Dog
* Birth Year 12% = 3 ➜ Pig
* Birth Year 12% = 4 ➜ Rat
* Birth Year 12% = 5 ➜ Ox
* Birth Year 12% = 6 ➜ Tiger
* Birth Year 12% = 7 ➜ Rabbit
* Birth Year 12% = 8 ➜ Dragon
* Birth Year 12% = 9 ➜ Snake
* Birth Year 12% = 10 ➜ Horse
* Birth Year 12% = 11 ➜ Goat

`birthdate = input.nextInt();`

`year = birthdate%12;`

```
switch (year){
            case 0:
                hrsc = "Monkey";
                break;

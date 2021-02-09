# UTAD Password Generator

Password Generator to create a random password that falls in line with University of Toledo requirements. The program was written because I use a password manager frequently. I'm on the security concious side, so I create a new password for each website, but I do not have the patience to remember most by a phrase or words. Since the University restricts some characters my Password Maanger may propose (@, #, &, \`), figured it would be easier to make a password generator opposed to sifting through to find the bad characters.

## Password Generation Rules
- It MUST be between 8 and 15 characters in length
- It MUST contain at least 1 character from each of the following lists:
  - Uppercase Letters: A-Z
  - Lowercase Letters: a-z
  - Numbers: 0-9
  - Allowed Special Characters ! " $ % , ( ) * + - . / ; : = > ? \[ \ ] ^ _ { | } ~
    - These special characters ARE NOT ALLOWED: & # @ < blank or space
- It CANNOT be all numbers
- ~~It CANNOT be the same as the previous 10 passwords~~ 
  - *Doesn't matter, random generation, very unlikely repetition*
- It CANNOT contain 3 or more repetitions of the same character
- ~~It IS case sensitive i.e. "TOM" does NOT equal "tom"~~
  - *Doesn't matter, more of user note. Script or program checks if uppercase and lowercase present*
- ~~It CANNOT contain your user name or your first, last, or middle name~~
  - *Doesn't matter, random generation. Unless name is "Al", it's not gonna happen*

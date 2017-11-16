# YoRPG_TheCocaColaCompany
---
Members: Kathleen T.  Wong, Benjamin T. Shapiro, Aidan T. Griffin

## Instructions
1. Choose the difficulty of ye fate
2. State thy name
3. Choose a class, each will have its unique abilities
4. With luck, no monsters will fall on your path but if they do, you will be ready
5. Collect the cansOCola along the way, they may aid you in the end
6. Save the world, hero

## Feature Additions
  * cansOCola can be collected with or without a battle and used to revive characters
  * meleeattack, magicattack, rangedattack : different subclasses of Protagonists have different way to calculate attack

## Code Restructuring
  * Added additional if statement in YoRPG , allowing player to choose if they want to be revived, given they have enough cansOCola
  * Added attacktype to each protgaonist, as well as variables for dex and intel
  * Added different equations in attack method of Protagonist, depending on attacktype

## Character Attributes :thumbsup:

1. hitPTS
2. strength
3. defense
4. attack
5. meleeattack,
6. rangedattack
7. magicattack
8. hitchance
9. dex
10. intel

## Protagonists :angel:
### Subclasses
 1. Warrior
    * meleeattack
    * increased strength
    *  decreased defense

  2. Assassin
  * meleeattack
  * increased meleeattack , hitchance
  * lower defense ,hitPts

 3. Paladin
  * meleeattack
  * increased defense
  * decreased strength

 4. Arbalest
  * rangedattack
  * increased dex, defense, rangedattack, lower hitchance

 5. Archer
  * rangedattack
  * higher dex
  * lower defense

 6. Mage
  * magicattack
  * higher intel
  * lower defense

 7. Musketeer
  * rangedattack
  * lower defense, hitchance
  * higher rangedattack

 8. Sorcerer
  * magicattack
  * higher intel, magicattack
  * lower defense, hitchance

 9. Swordsman
  * meleeattack
  * higher defense, hitchance
  * lower meleeattack

 10. Warlock
  ** magicattack
  ** higher intel, magicattack
  ** lower defnse, hitchance
### Attack Types
  * meleeattack
    ** defined as strength * meleeattack - Monster's defense
  * rangedattack
    ** defined as dex * rangedattack - (Monster's defense /2)
  * magicattack
    ** defined as intel * magicattack

## Monsters :japanese_ogre:

1. Demon
  * stronger attack rating

2. Kraken
  * higher health, higher strength

3. Zombie
  * higher defense



## Experimental Vision

1. Create a Rewards System - can be used in batttles/revival

2. More attributes and random variables for each Protagonist

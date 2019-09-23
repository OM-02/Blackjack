# Blackjack Game
This is a simple blackjack game created for a school project.

The game has been updated to implement a deck system which creates a card object with a suit and a rank. It then creates an ArrayList of cards and shuffles it with Collections.shuffle. Cards will not be duplicated and the deck system works fully. The deck does also persists between the dealer's hand and the player's hand.

Aces are automatically dealt with by being assumed to be 11 until them being 11 would cause a bust, at which point they are changed to a 1. This feature does work with multiple aces. A hand with two aces and a four will be worth 16. Drawing a 6 will cause the remaining ace to change to a 1 and make the hand worth 12. Drawing a third ace will make the hand worth 13, but a 10 will cause a bust.

The game can now accept bets and pays a 3:2 ratio. It cannot keep track of any sort of balance and immediately gets rid of any bets made after a hand is played.

## Current Features:
- Automatic ace handling
- Shuffled deck system
- Dealer plays and can win
- Betting system

## Planned Features:
- Move the player's hand and actions to a separate class (finished)
    - Possibly add the option for multiple people to play?
- Add a splitting feature
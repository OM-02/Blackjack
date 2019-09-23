# Blackjack Game
This is a simple blackjack game created for a school project.

The game has been updated to implement a deck system which creates a card object with a suit and a rank. It then creates an ArrayList of cards and shuffles it with Collections.shuffle. Cards will not be duplicated and the deck system works fully. The deck does also persists between the dealer's hand and the player's hand.

Aces are automatically dealt with by being assumed to be 11 until them being 11 would cause a bust, at which point they are changed to a 1. This feature does work with multiple aces. A hand with two aces and a four will be worth 16.

## Current Features:
- Automatic ace handling
- Shuffled deck system
- Dealer plays and can win

## Planned Features:
- Move the player's hand and actions to a separate class
- Add a money system
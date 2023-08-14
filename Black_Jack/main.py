import random

class card:
   def __init__(self,suit,rank):
        self.suit=suit
        self.rank=rank
   def __str__(self):
      return self.rank["rank"]+" of " +self.suit




class deck:
    def __init__(self):
   
        self.cards=[]
        suits=["hearts","spades","clubs","Diamonds"]
        ranks=[
        {"rank":"A","value":"11"},
        {"rank":"1","value":"1"},
        {"rank":"2","value":"2"},
        {"rank":"3","value":"3"},
        {"rank":"4","value":"4"},
        {"rank":"5","value":"5"},
        {"rank":"6","value":"6"},
        {"rank":"7","value":"7"}, 
        {"rank":"8","value":"8"},
        {"rank":"9","value":"9"},
        {"rank":"10","value":"10"},
        {"rank":"J","value":"10"},
        {"rank":"Q","value":"10"},
        {"rank":"K","value":"10"},
        ]
        for i in suits:
            for rank in ranks:
             self.cards.append(card(i,rank))

    def shuffle(self): 
        if len(self.cards)>1:    
         random.shuffle(self.cards)
      
    def deal(self,number):
     cards_dealt=[]
     for x in range(number):
        if(len(self.cards)>0):
         self.card=self.cards.pop()
         cards_dealt.append(self.card)
     return cards_dealt

class hand:
   def __init__(self,dealer=False):
      self.cards=[]
      self.value=0
      self.dealer=dealer
   def addCard(self,cardList):
      self.cards.extend(cardList)
   def calculate_value(self):
      self.value=0
      hasAce=False
      for card in self.cards:
         card_value=int(card.rank["value"])
         self.value+=card_value
         if card.rank["rank"]=="A":
            hasAce=True
      if hasAce and self.value>21:
         self.value-=10   
   def getValue(self):
      self.calculate_value()
      return self.value    
   def isBlackJack(self):
      return self.value==21
   def display(self,showDealerCards=False):
    print(f'''{"Dealer's" if self.dealer==True else "your"}:hand ''')
    for index,card in enumerate(self.cards):
       if index==0 and self.dealer and not showDealerCards and not self.isBlackJack(): 
        print("hidden")
       else:
          print(card)
    if not self.dealer:
       print("value",self.getValue())   
       
                    
class game:
   def play(self):
      Gama_Number=0
      Games_to_play=0
      while Games_to_play<=0:
         try:
            Games_to_play=int(input("Enter number of games to be played"))
         except:
            print("enter a valid Number")   
      while Gama_Number<Games_to_play:
          Gama_Number+=1      
          Deck=deck()
          Deck.shuffle()
          player_hand=hand()
          dealerHand=hand(dealer=True)
          for i in range(2):
             player_hand.addCard(Deck.deal(1))
             dealerHand.addCard(Deck.deal(1))
          print()
          print("*"*30)
          print("Game Number :",Gama_Number,"of",Games_to_play)   
          print("*"*30)
          player_hand.display()
          dealerHand.display()
          if self.check_winner(player_hand,dealerHand):
             continue
          choice=""
          while player_hand.getValue()<21 and choice not in ["s","stand"]:
             choice=input("please choose Hit or Stand").lower()
             print()
             while choice not in ["h","s","hit","stand"]:
                choice=input("please choose one option among H/s or hit/stand").lower()
                print()
             if choice in ["hit","h"]:
                player_hand.addCard(Deck.deal(1))  
                player_hand.display() 

          if self.check_winner(player_hand,dealerHand):
             continue    
          player_hand_value=player_hand.getValue()
          dealerHandValue=dealerHand.getValue()
          while dealerHandValue<17:
             dealerHand.addCard(Deck.deal(1))
             dealerHandValue=dealerHand.getValue()
          dealerHand.display(showDealerCards=True)     
          if self.check_winner(player_hand,dealerHand):
             continue
          print("Final Results")
          print("your hand",player_hand_value)
          print("dealer hand",dealerHandValue)
          #self.check_winner(player_hand,dealerHand,True)
      print("\n Thanks for playing")    
             



   def  check_winner(self,player_hand,dealerHand,gameOver=False):
       if not gameOver:
         if player_hand.getValue()>21:
            print("you lose! Dealer wins")
            return True
         elif dealerHand.getValue()>21:
            print("you win ! Dealer Busted")
         elif dealerHand.isBlackJack() and player_hand.isBlackJack():
            print("its a tie")   
            return True
         elif  player_hand.isBlackJack():
            print("you have black jack you win")
            return True
         elif dealerHand.isBlackJack():
            print("Dealer has black Jack !Dealer wins")
            return True
       else:
          if player_hand.getValue()>dealerHand.getValue():
             print("you win you have more Value")
          elif   player_hand.getValue()==dealerHand.getValue():
             print("its a tie")
          else:
             print("Dealer wins! Dealerhas more value")   
          return True    

       return False
        
       
          

g=game()
g.play()

             





"""cards_dealt=deal(2)
card=cards_dealt[0]
rank=card[1] 
if(rank=="A"):
    value=11
elif(rank=="J"or rank=="K"or rank=="Q"):
    value=10
else:
    value=rank
rank_dict={"rank":rank,"value":value}    
print(rank_dict["rank"],rank_dict["value"])    """



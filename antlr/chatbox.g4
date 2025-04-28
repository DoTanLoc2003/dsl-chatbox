grammar chatbox;

program: conditionalCommand|command;

command: (addProduct|deleteProduct|increaseAmount|decreaseAmount|setAmount|listAllProduct|viewCart|checkOut|applyDiscount);
conditionalCommand: IF condition THEN command;

condition: discountCheck|totalValue|itemAmount;
discountCheck: 'discount is applied';
compareWords: ('equal to'|'more than'|'less than');
totalValue: 'total is' compareWords MONEY;
itemAmount: 'amount is' compareWords QUANTITY;

addProduct: ADD QUANTITY (ID|NAME) ('to cart')?;
deleteProduct: DELETE (ID|NAME) ('from cart')?;
increaseAmount: INCREASE (ID|NAME) ('by')? QUANTITY;
decreaseAmount: DECREASE (ID|NAME) ('by')? QUANTITY;
setAmount: SET (ID|NAME) 'to' QUANTITY;
applyDiscount: 'apply' DISCOUNT;
listAllProduct: 'list product';
viewCart: 'view cart';
checkOut: 'check out';

ADD: 'add';
DELETE: 'delete';
INCREASE: 'increase';
DECREASE: 'decrease';
SET: 'set';
IF: 'if';
THEN: 'then';
DISCOUNT: ('Welcome'|'Goodbye'|'See you soon');

ID: [0-9]+;
NAME: [A-Z]?[a-z]+;
QUANTITY: [0-9]+;
TIME: [0-9][0-9]':'[0-9][0-9];
MONEY: [0-9]+'.'[0-9][0-9];

WS: [\t\r\n]+ -> skip;
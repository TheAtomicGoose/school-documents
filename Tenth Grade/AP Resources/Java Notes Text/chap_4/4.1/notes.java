/* #### Black Boxes #### */
/* _____________________ */


/*
 * A subroutine consists of instructions for performing some task, chunked together and given a
 * name. "Chunking" makes it so that you don't have to worry about the complicated process behind
 * a process; you only have to remember the name of the subroutine.
 *
 * A subroutine is said to be a black box because you can't see inside it. However, it does need
 * some kind of interface with the rest of the world so that you can interact with it. The first
 * rule of black boxes:
 *
 #### The interface of a black box should be fairly straightforward, well-defined, and easy
 #### to understand.
 *
 * The "inside" of a black box is called its implementation. The second rule of black boxes:
 *
 #### To use a black box, you shouldn't need to know anything about its implementation; all 
 #### you need to know is its interface.
 *
 * It should be possible to	change the implementation of a subroutine without the user being able
 * to detect the change. A black box should also be able to be used anywhere. The third rule of
 * black boxes:
 *
 #### The implementor of a black box should not need to know anything about the larger systems in
 #### which the box will be used.
 *
 * A black box divides the world into the inside (implementation) and the outside (the interface).
 *
 * An interface is not just a physical connection between the box and the outside world. It also
 * includes a specification of what the box does and how to control it. 
 * The interface of a subroutine has a semantic as well as a syntactic component.
 * To write a legal program you have to know the syntactic specification of the
 * subroutine. To understand the purpose of the subroutine and use it affectively,
 * you have to know its semantic specification. These two parts together, the
 * syntactic and semantic specification of a subroutine, are called the contract of
 * the subroutine. The contract of a subroutine basically says "Here is what you
 * have to do for me, and here is what I will do for you." 
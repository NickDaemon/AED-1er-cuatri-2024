.text:
lw a0, input
jal ra, factorial

#imprime el resultado
mv a0, t0
li a7, 1
ecall

li a7, 93
ecall

factorial:
#Prologo
#Me hago lugar en el stack y preservo la convencion
#Hay que guardar: ra(return adress) y el a0(n)

addi sp, sp, -8
sw ra, 4(sp)
sw a0, 0(sp)

#addi sp, sp, -4
#sw ra, 0(sp)

#addi sp, sp, -4
#sw a0, 0(sp)

#Caso base
bgt a0, zero, recursivo
#a0 = 1
#salto al epilogo

li, a0, 1
j epilogo


recursivo:
addi a0, a0, -1  
jal ra, factorial 
lw t0, 0(sp) #restauro el a0 original.
mul a0, a0, t0
    

#Epilogo
#Devuelvo el lugar del stack que me agarre,
#Restauro los registros saved y retorno
epilogo:
lw ra, 4(sp)

addi sp, sp, 8

ret #jalr x0, ra, 0
    











.data:
input: .word 0x00000003
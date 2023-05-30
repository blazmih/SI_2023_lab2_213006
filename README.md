# SI_2023_lab2_213006
1.Control Flow Graph, фотографија

![CFG (1)](https://github.com/blazmih/SI_2023_lab2_213006/assets/108891485/552725aa-1555-4281-8c02-b88e20cdc829)

2.Цикломатска комплексност: 

Ја пресметав со броење на предикатните јазли, во овој случај 10. 10+1=11, значи цикломатската комплексност изнесува 11

3.Тест случаи - Every Branch:

[silab2xlsx.xlsx](https://github.com/blazmih/SI_2023_lab2_213006/files/11594510/silab2xlsx.xlsx)

Тест случаи - Multiple Condition:

![350372611_168700166170450_5330410856439300767_n](https://github.com/blazmih/SI_2023_lab2_213006/assets/108891485/e463caf0-f326-4610-860a-c0308612388c)

4.Unit тестови објаснување:


Every Branch:

-Првиот тест случај е кога user=null со што се фрла exception

-Вториот тест случај е каде user има username, точен password со сите критериуми задоволени и точен email. Листата allUsers има user кој има различен username и email од внесениот user. Од овој тест се очекува излез true

-Третиот тест случај е каде user нема username, има password < 8 и точен email. Листата allUsers има user кој има различен username но ист email од внесениот user. Од овој тест се очекува излез false

-Четвртиот тест случај е каде user има username, има password кој содржи празно место и има email. Листата allUsers има user кој има ист username како внесениот user. Од овој тест се очекува излез false

-Петтиот тест случај е каде user има username, има password > 8 но без специјални знаци и има email кој е грешен. Листата allUsers има user кој има различен username и email од внесениот user. Од овој тест се очекува излез false



Multiple Condition:


-Првиот тест случај е кога user=null со што се фрла exception

-Вториот тест случај е кога password=null, но има username и email, се фрла exception

-Третиот тест случај е кога email=null,  но има username и password, се фрла exception

-Четвртиот тест случај е кога user има username, точен password со сите критериуми задоволени и точен email. Листата allUsers има user кој има различен username и email од внесениот user. Од овој тест се очекува излез true

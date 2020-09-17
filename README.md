# ETBR-VPN
Android VPN app based on OpenVPN library and fork of Cake-VPN.
- The main focus of this fork is to implement better functionality and major UI changes.
- Be sure to check the original project at https://github.com/ashraf789/Cake-VPN

## New things:
- The app now has support for user/password auth ovpns
- The app had some major UI changes and will have even more
- Some annoying bugs fixed

## Instruction to update server list:
1. Replace/add your .ovpn file with <b> assets/</b> directory .ovpn file
2. Now go to MainActivity.class and find the "getServerList()" method there you have to update server information.
3. [!Optional] At Last go to SharedPreference.class and find the "getServer()" method there update default server information.
</br> </br>
<img height='450' width ='300' src="https://i.imgur.com/kcGZY4P.png" /> 
</br>
<img height='400' width ='500' src="https://i.imgur.com/mlb8Nqe.png" />
</br>
<img height='400' width ='500' src="https://i.imgur.com/GgvoPP9.png" />



## License
**Free Software!**

This project, the uses of the VPN library "ICS OpenVPN" and the project its based on are all under GPLv2 License.

> Make sure you understand the licenses of the code. OpenVPN for Android is GPL licensed.

- see the [License File](LICENSE) for more details.


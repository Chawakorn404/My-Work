//
//  menuPage.swift
//  homePage
//
//  Created by Kowitme (iMac) on 14/11/2564 BE.
//

import SwiftUI

struct menuPage: View {
    var body: some View {

            ZStack{
        LinearGradient(gradient: Gradient(colors: [
            Color.purple,
            Color.black
            
        ]),
        startPoint: .topLeading,
        endPoint: .bottomLeading)
                .ignoresSafeArea(.all,edges: .all)
        
            
            VStack{
    
                        Text("เลือกเมนู")
                        .foregroundColor(.yellow)
                        .font(.system(size: 32, weight: .bold, design: .default))
                        .frame(maxWidth: .infinity)
                        .background(Color.purple)
                      
                 

                        NavigationLink(destination:tarrotPage()) {
                            Text("ไพ่ทาโร่")
                                .foregroundColor(Color.yellow)
                                .frame(width: 200, height: 20)
                                .padding()
                                .font(.system(size: 32, weight: .bold, design: .default))
                                .background(Color.purple)
                                .cornerRadius(30)
                    
                  }
                        
                NavigationLink(destination: todayPage()) {
                    Text("ดวงวันนี้")
                        .foregroundColor(Color.yellow)
                        .frame(width: 200, height: 20)
                        .padding()
                        .font(.system(size: 32, weight: .bold, design: .default))
                        .background(Color.purple)
                        .cornerRadius(30)
            
          }
                
                NavigationLink(destination: chinesePage()) {
                    Text("เซียมซี")
                        .foregroundColor(Color.yellow)
                        .frame(width: 200, height: 20)
                        .padding()
                        .font(.system(size: 32, weight: .bold, design: .default))
                        .background(Color.purple)
                        .cornerRadius(30)
            
          }
              }
            }
        }
    }
            
struct menuPage_Previews: PreviewProvider {
    static var previews: some View {
        menuPage()
    }
}

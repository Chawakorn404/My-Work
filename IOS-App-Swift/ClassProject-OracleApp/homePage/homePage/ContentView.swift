//
//  ContentView.swift
//  homePage
//
//  Created by Kowitme (iMac) on 14/11/2564 BE.
//

import SwiftUI

struct ContentView: View {
    @State private var action: Int? = 0
    var body: some View {
        NavigationView {
            ZStack{
        LinearGradient(gradient: Gradient(colors: [
            Color.purple,
            Color.black
            
        ]),
        startPoint: .topLeading,
        endPoint: .bottomLeading)
                .ignoresSafeArea(.all,edges: .all)
        
            
            VStack{
                  Text("ทำนายดวงชะตา")
                      .foregroundColor(.yellow)
                      .font(.system(size: 32, weight: .bold, design: .default))
                 Spacer()
             
                  
        
            Image("fortune01")
                .resizable()
                           .scaledToFill()
                           .frame(width: 200, height: 200)
            
            Spacer()
                        NavigationLink(destination: menuPage()) {
                            Text("กดที่นี่เพื่อไปต่อ")
                                .foregroundColor(Color.yellow)
                                .padding()
                                .font(.system(size: 32, weight: .bold, design: .default))
                                .background(Color.purple)
                                .cornerRadius(30)
                    
                  }
              }
            }
        }
            
        }
        
    
    
}
                
//            Button(action: {
//
//
//            })
//            {
//                Text("กดที่นี่เพื่อไปต่อ")
//
//                    .foregroundColor(Color.yellow)
//                    .padding()
//                    .font(.system(size: 32, weight: .bold, design: .default))
//                    .background(Color.purple)
//                    .cornerRadius(30)
//
//            }
        



struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

 #include<bits/stdc++.h>
    using namespace std;
    #define ll long long
    #define int long long
    #define loop(o,n) for(int i=o;i<n;i++)
    #define sort(a) sort(a.begin(),a.end())
    #define fast ios_base::sync_with_stdio(false); cin.tie(NULL);
    #define print(a) for(auto &i : a)  
  
    #define lower_bound(v,x) lower_bound(v.begin(),v.end(),x)
    #define upper_bound(v,x) upper_bound(v.begin(),v.end(),x)
    #define pb push_back
    const int dx[] = { 0, 1, 0, -1 } ; 
    const int dy[] = { 1, 0, -1, 0 } ; 

string read_file()
{
  string myText;
    ifstream Piyush_file_read("filename.txt");
  while (getline (Piyush_file_read, myText)) {
    cout << myText;
  }
    Piyush_file_read.close();
}
void write_file(string msg)
{
   ofstream Piyush_file_write("Binary_tree.txt",ios::app);  
   Piyush_file_write <<"\n"<< msg <<"\n";
   Piyush_file_write.close();
}

void int32_t main()
{
      vector<String> val = {"Abhishek","abishek","ABHISHEK"};
      
}
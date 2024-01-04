#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;

	vector<int> vec(n);

	for (int i = 0; i < n; i++) {
		cin >> vec[i];
	}

	vector<int> cpV(vec);

	sort(cpV.begin(), cpV.end());

	cpV.erase(unique(cpV.begin(), cpV.end()), cpV.end()); // 중복 제거

	for (int i = 0; i < n; i++) {
		int idx = lower_bound(cpV.begin(), cpV.end(), vec[i]) - cpV.begin();
		cout << idx << " ";
	}

	return 0;
}
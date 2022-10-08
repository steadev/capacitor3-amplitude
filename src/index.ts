import { registerPlugin } from '@capacitor/core';

import type { CapacitorAmplitudePlugin } from './definitions';

const CapacitorAmplitude = registerPlugin<CapacitorAmplitudePlugin>(
  'CapacitorAmplitude',
  {
    web: () => import('./web').then(m => new m.CapacitorAmplitudeWeb()),
  },
);

export * from './definitions';
export { CapacitorAmplitude };
